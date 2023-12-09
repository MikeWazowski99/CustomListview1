package com.example.listview1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.listview1.Model
import com.example.listview1.MyCustomAdapter
import com.example.listview1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        // val names= arrayOf("Swift", "Kotlin", "C++", "JavaScript", "Python","HTML5", "CSS", "Unreal Engine 5")
        var list = ArrayList<Model>()

        list.add(Model("Jack", "Hello World this person is Jack", R.drawable.ic_launcher_foreground))
        list.add(Model("John", "Hello World this person is John", R.drawable.ic_launcher_foreground))

//
//        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(
//            this, android.R.layout.simple_list_item_1, names
//        )

        listView.adapter = MyCustomAdapter(this, R.layout.custom_item_layout, list)

//        listView.setOnItemClickListener { adapterView, view, i, l ->
//            Toast.makeText(this, "Item Selected" + names[i], Toast.LENGTH_LONG)
//                .show()
//        }
    }
}