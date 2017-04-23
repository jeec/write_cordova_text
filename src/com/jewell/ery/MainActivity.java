/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package com.jewell.ery;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.apache.cordova.*;
import org.apache.cordova.engine.SystemWebView;
import org.apache.cordova.engine.SystemWebViewEngine;

public class MainActivity extends CordovaActivity {

    public final static String URL_BT01 = "file:///android_asset/www/index.html";
    public final static String URL_BT02 = "file:///android_asset/www/index1.html";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_activity);
        loadUrl(launchUrl);


    }

    public void doClick(View view){
        switch (view.getId()){
            case R.id.bt01:
                loadUrl(URL_BT01);
                break;
            case R.id.bt02:
                loadUrl(URL_BT02);
                break;
            case R.id.bt03:

                break;
            default:
        }
    }



    @Override
    protected CordovaWebView makeWebView() {
        SystemWebView webView =(SystemWebView)findViewById(R.id.cordovaWebView);
        return new CordovaWebViewImpl(new SystemWebViewEngine(webView));        }

    @Override
    protected void createViews() {
        appView.getView().requestFocusFromTouch();
    }


}
