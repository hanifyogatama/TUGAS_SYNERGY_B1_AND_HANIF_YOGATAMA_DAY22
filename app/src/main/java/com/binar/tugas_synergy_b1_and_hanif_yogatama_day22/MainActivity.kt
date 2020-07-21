package com.binar.tugas_synergy_b1_and_hanif_yogatama_day22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide.with(this)
            .load(R.drawable.oppa)
            .circleCrop()
            .into(ivProfile)

        Glide.with(this)
            .load(R.drawable.binar)
            .circleCrop()
            .into(ivHighlight1)

        Glide.with(this)
            .load(R.drawable.jakarta)
            .circleCrop()
            .into(ivHighlight2)

        Glide.with(this)
            .load(R.drawable.binar)
            .circleCrop()
            .into(ivHighlight3)

        Glide.with(this)
            .load(R.drawable.jakarta)
            .circleCrop()
            .into(ivHighlight4)
    }
}