package com.yydud.logs

import android.util.Log

object Logs {
    private val TAG: String = this.javaClass.name
    private var isLogEnabled: Boolean = true

    @JvmStatic fun setLog(enable: Boolean){
        isLogEnabled = enable
    }

    @JvmStatic fun d(message: String){
        if(isLogEnabled){
            Log.d(TAG, message)
        }
    }

    @JvmStatic fun w(message: String){
        if(isLogEnabled){
            Log.w(TAG, message)
        }
    }

    @JvmStatic fun e(message: String){
        if(isLogEnabled){
            Log.e(TAG, message)
        }
    }

    @JvmStatic fun i(message: String){
        if(isLogEnabled){
            Log.i(TAG, message)
        }
    }

    @JvmStatic fun v(message: String){
        if(isLogEnabled){
            Log.v(TAG, message)
        }
    }

    @JvmStatic fun wtf(message: String){
        if(isLogEnabled){
            Log.wtf(TAG, message)
        }
    }

    @JvmStatic fun print(message: String){
        if(isLogEnabled){
            print(message)
        }
    }
}