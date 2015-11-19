package com.example.client;

import retrofit.RestAdapter;

/**
 * Created by Liping on 11/19/15.
 */
public class APIManager {
    private static final String API_URL = "http://polls.apiblueprint.org/";
    private static RestAdapter restAdapter;


    public static APIRequest getAPIRequest() {
        APIRequest instance = null;
        try {
            if (restAdapter == null) {
                restAdapter = new RestAdapter.Builder()
                        .setEndpoint(API_URL)
                        .build();
            }
            instance = restAdapter.create(APIRequest.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
}
