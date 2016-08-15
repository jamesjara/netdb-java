package com.netdb.netdbapi;

import com.google.gson.Gson;
import com.netdb.netdbapi.information.TargetInformation;
import com.netdb.netdbapi.rest.IApiMethods;
import com.netdb.netdbapi.rest.SessionRequestInterceptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import okhttp3.OkHttpClient;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author NoaD
 */
public class Api {

    private static final String API_URL = "https://api.netdb.io/";
    //private static final String keyId = "YOUR KEY_ID";
    private static final String keyId = "5HV7SQ1JPK3V971QOMKWG2BF1";
    //private static final String keySecret = "YOUR KEY_SECRET";
    private static final String keySecret = "dTzFbfKJpXBlCtHNbTQENF9bexxT3OlZWG/RYBW8Grk";

    public static final String auth = Base64.getEncoder().encodeToString((keyId + ":" + keySecret).getBytes());

    private final OkHttpClient client;

    public Api() {
        client = new OkHttpClient.Builder().addInterceptor(new SessionRequestInterceptor()).build();
    }

    /**
     * make a syncronous request with the parameters
     *
     * @param page
     * @param per_page
     * @param query
     * @return ArrayList<TargetInformation> with all information
     */
    public ArrayList<TargetInformation> getScanSyncResult(String page, String per_page, String query) {

        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();

        IApiMethods service = retrofit.create(IApiMethods.class);

        try {
            return service.getScanResult(page, per_page, "*", query).execute().body();
        } catch (IOException ex) {
            return new ArrayList<>();
        }
    }

    /**
     * make a aync request with the parameters
     * @param page
     * @param per_page
     * @param query
     * @param callback 
     */
    public void getAsyncResult(String page, String per_page, String query, Callback<ArrayList<TargetInformation>> callback) {

        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();

        IApiMethods service = retrofit.create(IApiMethods.class);

        service.getScanResult(page, per_page, "*", query).enqueue(callback);
    }
}
