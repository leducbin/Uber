package com.example.bin.uberclone.Common;

import com.example.bin.uberclone.Remote.IGoogleAPI;
import com.example.bin.uberclone.Remote.RetrofitClient;

/**
 * Created by Bin on 11/01/2017.
 */

public class Common {
    public static final String baseURL = "https://maps.googleapis.com";
    public static IGoogleAPI getGoogleAPI()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
}
