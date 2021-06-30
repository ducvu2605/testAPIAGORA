package com.example.testapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    // De tat ca vao unit test ms build dc . day chi la xay dung

    static String appId = "006f59a075694440b36f1004f7a79036";
    static String appCertificate = "e7d006defeb64a07973ea9df00c8c149";
    static String channelName = "DucVu";
    static int uid = 0;
    static int expirationTimeInSeconds = 3600;

    public static void main(String[] args) throws Exception {
        RtcTokenBuilder token = new RtcTokenBuilder();
        int timestamp = (int) ((Calendar.getInstance().getTimeInMillis() / 1000) + expirationTimeInSeconds);

        String result = token.buildTokenWithUid(appId,
                appCertificate,
                channelName,
                uid,
                RtcTokenBuilder.Role.Role_Publisher,
                timestamp);
        System.out.println(result);
    }
}