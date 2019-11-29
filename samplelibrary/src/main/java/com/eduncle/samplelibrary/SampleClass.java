package com.eduncle.samplelibrary;

import android.content.Context;
import android.widget.Toast;

public class SampleClass
{
    public static void printToast(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
