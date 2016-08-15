package com.netdb.netdbapi.rest;

import com.netdb.netdbapi.Api;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author dalgarins
 */
public class SessionRequestInterceptor implements Interceptor {

    public SessionRequestInterceptor() {
    }
    
    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();
        Request newRequest;
        if (Api.auth != null) {
            newRequest = request.newBuilder()
                    .addHeader("Authorization", "Basic " +  Api.auth)
                    .build();
            return chain.proceed(newRequest);
        }
        return chain.proceed(request);
    }
}
