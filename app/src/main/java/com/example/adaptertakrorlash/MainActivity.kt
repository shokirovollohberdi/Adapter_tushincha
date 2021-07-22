package com.example.adaptertakrorlash

import Adapter.MyAdapter
import Cash.MySharedPreference
import Models.User
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var myAdapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MySharedPreference.init(this)


        btn_save.setOnClickListener {
            var name = edt_name.text.toString().trim()
            var password = edt_password.text.toString().trim()
            if (name != "" && password != "") {
                val list = MySharedPreference.obektString
                list.add(User(name, password))
                edt_name.text.clear()
                edt_password.text.clear()
                MySharedPreference.obektString = list
                myAdapter = MyAdapter(this,list)
                list_view.adapter = myAdapter

            } else {
                Toast.makeText(this, "Ma'lumot toliq emas", Toast.LENGTH_SHORT).show()
            }
        }
        val list  = MySharedPreference.obektString
        MySharedPreference.obektString = list
        myAdapter = MyAdapter(this,list)
        list_view.adapter = myAdapter



    }
}