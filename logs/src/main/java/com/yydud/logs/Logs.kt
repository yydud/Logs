package com.yydud.logs

import android.util.Log

class Logs {

    companion object {
        private val TAG: String = this@Companion.javaClass.name
        private var IS_LOG: Boolean = true

        fun setLog(isLog: Boolean = true){
            IS_LOG = isLog
        }
        fun d(log: String){
            if(IS_LOG){
                Log.d(TAG, log)
            }
        }
    }
}