package com.example.logutil;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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


    public void StartShare(Context context,ArrayList<String> mFileList) {
        String Type = "";

            Type = "application/pdf";


        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND_MULTIPLE);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Here are some files.");
        intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.setType(Type);

        ArrayList<Uri> files = new ArrayList<>();

        for (String path : mFileList /* List of the files you want to send */) {
            String shareUri = path;
            files.add(Uri.parse(shareUri));
        }

        intent.putParcelableArrayListExtra(Intent.EXTRA_STREAM, files);
        context.startActivity(intent);
    }

}