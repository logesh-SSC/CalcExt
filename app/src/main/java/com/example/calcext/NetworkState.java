package com.example.calcext;

import android.content.Context;
import android.net.ConnectivityManager;

public class NetworkState {


    public static boolean connectionAvailable(Context c) {

        ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo() != null;
    }
}
