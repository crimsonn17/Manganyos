/*
 *
 *  Created by Muhamamd Sya'ban Nugroho
 *  Desember 2019
 * /
 */

package com.application.manganyos.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yanchummar on 1/14/18.
 */

public class ApiClient {

    public static final String BASE_URL = "https://its-syaban.com/apiclient/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
