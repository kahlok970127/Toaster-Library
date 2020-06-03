package com.example.logutil;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }

    public static void add(Context context,int a, int b, int c){
        a=b+c;

        Toast.makeText(context,a,Toast.LENGTH_SHORT).show();
    }



}