package com.example.kmlpbl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview: ListView
        val adapter: ListViewAdapter
        // adapter 생성
        adapter = ListViewAdapter()

        // 리스트뷰 참조 및 Adapter달기
        listview = findViewById<View>(R.id.mainListView) as ListView
        listview.adapter = adapter

        adapter.addItem(
            ContextCompat.getDrawable(this, R.drawable.cloth1)!!,
            "맨투맨", "맨투맨1이다"
        )
        adapter.addItem(
            ContextCompat.getDrawable(this, R.drawable.cloth2)!!,
            "셔츠", "셔츠이다"
        )
        adapter.addItem(
            ContextCompat.getDrawable(this, R.drawable.cloth3)!!,
            "맨투맨2", "맨투맨2이다"
        )
    }
}
