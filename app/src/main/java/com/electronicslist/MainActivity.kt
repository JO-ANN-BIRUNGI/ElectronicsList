package com.electronicslist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Step1-Adapterview:ListView
        var listview: ListView = findViewById(R.id.listv)
        //step2 -define     Adapter
        var adapter =MyAdapter(this,generateData())
        listview?.adapter=adapter
        adapter?.notifyDataSetChanged()
    }

    //Step3-Data source
    fun generateData():ArrayList<electrinicsmode>{
        val result = ArrayList<electrinicsmode>()
        var Electronic1:electrinicsmode= electrinicsmode("Camera","50,000 shillings",R.drawable.camera)
        var Electronic2:electrinicsmode=electrinicsmode("Headphones","20,000 shillings",R.drawable.headphones)
        var Electronic3:electrinicsmode=electrinicsmode("Speakers","50,000 shillings",R.drawable.speakers)
        var Electronic4:electrinicsmode= electrinicsmode("Phone","600,000 shillings",R.drawable.phone)
        var Electronic5:electrinicsmode=electrinicsmode("Fridge","500,000 shillings",R.drawable.fridge)
        var Electronic6:electrinicsmode=electrinicsmode("Flat Iron","30,000 shillings",R.drawable.flat_iron)
        var Electronic7:electrinicsmode=electrinicsmode("TV","800,000 shillings",R.drawable.tv)
        var Electronic8:electrinicsmode=electrinicsmode("Remote","800,000 shillings",R.drawable.remotes)


        result.add(Electronic1)
        result.add(Electronic2)
        result.add(Electronic3)
        result.add(Electronic4)
        result.add(Electronic5)
        result.add(Electronic6)
        result.add(Electronic7)
        result.add(Electronic8)
        return result
    }
}