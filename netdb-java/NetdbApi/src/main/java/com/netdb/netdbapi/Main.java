/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netdb.netdbapi;

import com.netdb.netdbapi.information.TargetInformation;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 *
 * @author NoaD
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Api api = new Api();

        //sync request
        ArrayList<TargetInformation> array = api.getScanSyncResult("1", "2", "apache");
        System.out.println(array.toString());

        //async request
        api.getAsyncResult("1", "2", "apache", new Callback<ArrayList<TargetInformation>>() {

            @Override
            public void onResponse(Call<ArrayList<TargetInformation>> call, Response<ArrayList<TargetInformation>> rspns) {
                System.out.println("Async: " + rspns.body().toString());
            }

            @Override
            public void onFailure(Call<ArrayList<TargetInformation>> call, Throwable thrwbl) {
                System.err.println("Error in request!");
            }
        });

    }

}
