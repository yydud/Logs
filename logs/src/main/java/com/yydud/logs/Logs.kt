package com.yydud.logs

import android.util.Log

public object Logs {
    private val TAG: String = this.javaClass.name
    private var isLogEnabled: Boolean = true
    private var isLogEnabled2: Boolean = true

    @JvmStatic
    public fun setLog(enable: Boolean){
        isLogEnabled = enable
    }

    @JvmStatic
    public fun d(message: String){
        if(isLogEnabled){
            Log.d(TAG, message)
        }
    }

    @JvmStatic
    public fun w(message: String){
        if(isLogEnabled){
            Log.w(TAG, message)
        }
    }

    @JvmStatic
    public fun e(message: String){
        if(isLogEnabled){
            Log.e(TAG, message)
        }
    }

    @JvmStatic
    public fun i(message: String){
        if(isLogEnabled){
            Log.i(TAG, message)
        }
    }

    @JvmStatic
    public fun v(message: String){
        if(isLogEnabled){
            Log.v(TAG, message)
        }
    }

    @JvmStatic
    public fun wtf(message: String){
        if(isLogEnabled){
            Log.wtf(TAG, message)
        }
    }

    @JvmStatic
    public fun print(message: String){
        if(isLogEnabled){
            print(message)
        }
    }
}