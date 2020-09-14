package com.example.kotlindemo

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by zhangce on 2020/9/11
 */
class SelectAdapter(context: Context, list: ArrayList<DataBean>) : RecyclerView.Adapter<SelectAdapter.SelectHolder>() {
    private val mContext = context
    private var mList = list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectHolder {
        var holder : SelectHolder
        val inflate = View.inflate(mContext, R.layout.item_select, null)
        holder = SelectHolder(inflate)
        return holder
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: SelectHolder, position: Int) {
        holder.itemStr.text = mList[position].name
        holder.itemStr.setOnClickListener { v ->
            Toast.makeText(mContext, "条目：" + position, Toast.LENGTH_SHORT).show()
        }
    }

    class SelectHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemStr = itemView.findViewById<TextView>(R.id.item_name)
    }
}