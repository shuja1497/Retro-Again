package com.shuja1497.retrofitwithimgurapi.api;

import android.os.StrictMode;

import com.shuja1497.retrofitwithimgurapi.model.Basic;
import com.shuja1497.retrofitwithimgurapi.model.Image;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by shuja1497 on 3/14/18.
 */

// describes the endpoints we will connect to .
public interface imgur {

    String BASE_URI = "https://api.imgur.com";
    String IMGUR_CLIENT_ID = "f3003277467e992";
    String AUTHORIZATION_URL = "https://api.imgur.com/oauth2/authorize?"+"client_id="+IMGUR_CLIENT_ID+"&response_type=token";
    String REDIRECT_URL = "https://treehouseworkshop:88";

    interface Auth{
        @GET("3/account/{username}/images/{page}")
        Call<Basic<ArrayList<Image>>> images(@Path("username") String username,
                                             @Path("page") int page);
    }

}
