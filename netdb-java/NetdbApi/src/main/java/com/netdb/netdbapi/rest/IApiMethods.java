package com.netdb.netdbapi.rest;

import com.netdb.netdbapi.information.TargetInformation;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 *
 * @author dalgarins
 */
public interface IApiMethods {  
    
    @GET("/v1/search")
    Call<ArrayList<TargetInformation>> getScanResult(@Query("page") String page, 
            @Query("per_page") String per_page,
            @Query("fields") String fields,
            @Query("q") String q);    
}
