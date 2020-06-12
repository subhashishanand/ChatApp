package com.edunomics.chatapp.Fragments;

import com.edunomics.chatapp.Notifications.MyResponse;
import com.edunomics.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAE2LeKMg:APA91bF5cPkrcE6iI9U8TEiEAIt9zGvKHPQiFtNwW7UB78L2rjiFrAuaqxlv5HSGyOvzeLDAdh_UpQKLvdg8fdN9CXQrbAkZCszLIUXxSGXG83XD5JF8HqqesZldMIqIARFmm-ax4gYD"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
