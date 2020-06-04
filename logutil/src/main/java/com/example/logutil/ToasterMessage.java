package com.example.logutil;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.StrictMode;
import android.widget.Toast;

import java.util.ArrayList;

public class ToasterMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }

    public static void add(Context context, String b, String c){
       String  a= b + c;

        Toast.makeText(context,a,Toast.LENGTH_SHORT).show();
    }

    public static int plus( int b, int c){
       return b+c;
    }


    public static void StartShare(Context context,ArrayList<String> mFileList) {
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND_MULTIPLE);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Here are some files.");
        intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.setType("text/html");

        intent.putStringArrayListExtra(Intent.EXTRA_STREAM, mFileList);
        context.startActivity(intent);
    }

    public static void share(Context context,String a){
        Intent shareIntent = new Intent();
        shareIntent.setType("text/html");
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "This is the URL I'm sharing.");
        shareIntent.putExtra(Intent.EXTRA_TEXT, a);
        context.startActivity(Intent.createChooser(shareIntent, "Share With..."));
    }

}