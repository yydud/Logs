package com.sample.yydud.logs

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sample.yydud.logs.databinding.ActivityMainBinding
import com.yydud.logs.Logs
import org.json.JSONObject

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun init() {
        binding.apply {

            // Json Format
            jsonTv.setOnClickListener {
                Logs.json("{\"name\":\"김진우\",\"age\":29,\"isMember\":true,\"address\":{\"city\":\"서울\",\"district\":\"강남구\",\"postalCode\":12345},\"favorites\":{\"colors\":[\"빨강\",\"파랑\",\"초록\"],\"numbers\":[7,14,21,28]},\"history\":[{\"year\":2019,\"event\":\"졸업\",\"details\":\"서울대학교졸업\"},{\"year\":2020,\"event\":\"입사\",\"details\":\"회사A에입사\"},{\"year\":2023,\"event\":\"승진\",\"details\":\"팀장으로승진\"}],\"contacts\":[{\"type\":\"email\",\"value\":\"jinwoo.kim@example.com\"},{\"type\":\"phone\",\"value\":\"010-1234-5678\"}]}\n")
            }
        }
    }


}