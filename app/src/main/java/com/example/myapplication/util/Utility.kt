package com.example.myapplication.util

import android.content.Context
import android.widget.Toast

object Utility {
        fun showToast(context : Context, message: String){
            Toast.makeText(context,message,Toast.LENGTH_LONG).show()
        }
    }