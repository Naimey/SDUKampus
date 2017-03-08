package com.example.zulkuf.sdukampus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by zulkuf on 06/03/17.
 */

public class SplashScreen extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Thread zaman = new Thread(){
            @Override
            public void run() {

                try {
                    sleep(3000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent intent  = new Intent("android.intent.action.LOGIN");
                    startActivity(intent);
                }

            }
        };
        zaman.start();
    }
}
