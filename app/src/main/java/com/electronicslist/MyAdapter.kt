package com.electronicslist

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private var activity: Activity, private var items:ArrayList<electrinicsmode>):
    BaseAdapter() {
    //start implementing the methods
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): electrinicsmode {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //this for generating items
        val view: View?
        val viewHolder:ViewHolder
        if (convertView== null){
            val inflater= activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            //layout inflater is used to get the view object which you define layout xml
            //Layout inflator will be used when you donot have a layoput
            view=inflater.inflate(R.layout.list_view_layout,null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder


        }else{
            view = convertView
            viewHolder= view.tag as    ViewHolder
        }
        var electronics =items[position]
        viewHolder.txtname?.text=electronics.name
        viewHolder.txtprice?.text=electronics.price
        //viewHolder.flagimg?.setImageResource(R.drawable.ic_launcher_foreground)
        viewHolder.electronicimg?.setImageResource(electronics.electronic)
        return view as View
    }
    private class ViewHolder(row: View?){
        var txtname: TextView?=null
        var txtprice: TextView?=null
        var electronicimg: ImageView?=null

        init {
            //    this.txtname=row?.findViewById(R.id.list)
            this.txtname=row?.findViewById(R.id.textelectronics)
            this.txtprice=row?.findViewById(R.id.textprice)
            this.electronicimg=row?.findViewById(R.id.imageView)

        }


    }
}