package com.app.ecommerce.notification;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

public class MyFirebaseInstanceIdService extends com.google.firebase.iid.FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";

    @Override
    public void onTokenRefresh() {

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        Log.e(TAG, "Refreshed token: " + refreshedToken);

    }
    private void sendRegistrationToServer(String token) {
    }
}