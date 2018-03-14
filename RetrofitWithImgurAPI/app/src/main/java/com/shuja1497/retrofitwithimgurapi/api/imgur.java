package com.shuja1497.retrofitwithimgurapi.api;

import android.os.StrictMode;

/**
 * Created by shuja1497 on 3/14/18.
 */

public interface imgur {

    String BASE_URI = "https://api.imgur.com";
    String IMGUR_CLIENT_ID = "f3003277467e992";
    String AUTHORIZATION_URL = "https://api.imgur.com/oauth2/authorize?" +
            "client_id="+IMGUR_CLIENT_ID+"&response_type=token";
    String REDIRECT_URL = "https://treehouseworkshop:88";


}
