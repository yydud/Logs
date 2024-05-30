package com.yydud.logs

import android.util.Log
import com.yydud.logs.utils.Formats

public object Logs {
    private val TAG: String = this.javaClass.name
    public var isLogEnabled: Boolean = true
    private val formats: Formats = Formats()

    init {

    }

    @JvmStatic
    public fun setLog(enable: Boolean){
        isLogEnabled = enable
    }

    @JvmStatic
    public fun json(message: String){
        if(isLogEnabled){
            try {
                val formattedJsonString = formats.formatAndSortJsonString(message)
                // Log.d에 출력할 수 있도록 긴 문자열을 줄바꿈으로 나눔
                val lines = formattedJsonString.split("\n")
                // 가정: 로그 라인의 평균 길이를 80으로 설정
//                val borderLine = "#".repeat(80)
                // 로그 시작 부분에 특수 문자 추가
                Log.d(TAG, "## Logs Start ##")
                for (line in lines) {
                    Log.d(TAG, line)
                }
                // 로그 마지막 부분에 특수 문자 추가
                Log.d(TAG, "## Logs End ##")
            } catch (e: Exception) {
                Log.e(TAG, "JSON parsing error: $e")
            }
//            Log.d(TAG, formats.formatAndSortJsonString(message))
        }
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