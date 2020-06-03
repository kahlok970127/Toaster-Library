package com.example.logutil;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

//    public static void s(Context c, String message){
//
//        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
//
//    }

    public float x,y;

    public ToasterMessage(ToasterMessage vec){
        this.x=vec.x;
        this.y=vec.y;
    }

    public ToasterMessage(float x,float y)
    {
        this.x=x;
        this.y=y;
    }
    public  ToasterMessage copy(){
        return new ToasterMessage(this);
    }

    public void debug(){
        System.out.println("{"+x+","+y+"}");
    }

}