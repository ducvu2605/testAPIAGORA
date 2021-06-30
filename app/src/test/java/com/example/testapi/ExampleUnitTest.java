package com.example.testapi;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void MainActivity () {
         String appId = "006f59a075694440b36f1004f7a79036";
         String appCertificate = "e7d006defeb64a07973ea9df00c8c149";
         String channelName = "reAuzEpbPbVvRlK21GzpCx0ujDj2";
         int uid = 0;
         int expirationTimeInSeconds = 3600;


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