package com.example.logutil;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }

    public static void add(Context context, String b, String c){
       String  a= b + c;

        Toast.makeText(context,a,Toast.LENGTH_SHORT).show();
    }



}