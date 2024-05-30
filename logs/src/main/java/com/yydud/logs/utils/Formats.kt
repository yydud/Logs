package com.yydud.logs.utils

import org.json.JSONObject

public class Formats {
    public fun formatAndSortJsonString(jsonString: String): String {
        // JSON 문자열을 JSONObject로 변환
        val jsonObject = JSONObject(jsonString)

        // JSONObject를 정렬된 형태로 변환
        val sortedJsonObject = JSONObject()
        val keys = jsonObject.keys().asSequence().toList().sorted()
        for (key in keys) {
            sortedJsonObject.put(key, jsonObject.get(key))
        }

        // 정렬된 JSONObject를 문자열로 변환
        return sortedJsonObject.toString(4) // 들여쓰기 4칸
    }
}