package com.example.kotlindemo

import android.content.Context
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_select.*

/**
 * Created by zhangce on 2020/9/11
 */
class SelectActivity : AppCompatActivity() {
    private lateinit var selectView: RecyclerView
    private lateinit var selectViewAdapter: SelectAdapter
    private lateinit var dataList: ArrayList<DataBean>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)
        init()
    }

    private fun init() {
        dataList = arrayListOf()
        for (i in 1..9) {
            dataList.add(DataBean("条目：" + i))
        }

        selectView = select_view
        selectView.layoutManager = GridLayoutManager(this, 3)
        //https://www.jianshu.com/p/9777e1f4846b
        selectView.addItemDecoration(SpaceItemDecoration(resources.getDimensionPixelOffset(R.dimen.list_space)))
        selectView.adapter = SelectAdapter(this, dataList)
    }
}