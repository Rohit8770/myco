package com.example.profileapplication.Utils;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;


public class DialogProgressBar {

    Context context;
    Dialog dialog;
    public DialogProgressBar(Context context) {
        this.context = context;


        if (dialog == null){
            dialog = new Dialog(context);
           // dialog.setContentView(R.layout.dialog);
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.setCancelable(false);
        }
    }
    public void createDialog(){
        if (!dialog.isShowing()){
            dialog.show();
        }
    }
    public void cancelDialog(){
        if (dialog.isShowing()){
            dialog.dismiss();
        }
    }
}

