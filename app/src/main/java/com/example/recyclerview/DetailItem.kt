package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.model.Model
import kotlinx.android.synthetic.main.activity_detail_item.*

class DetailItem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_item)
//        Extras Object
        intent?.extras?.get("DATA").let {
            if (it is Model){
                title2.text = it.title
                description2.text = it.des
                imageView.setImageResource(it.image)
            }
        }

    }
}