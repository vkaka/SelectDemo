package com.example.kotlindemo

import android.content.Context
import android.util.AttributeSet
import android.widget.RadioButton
import android.widget.RelativeLayout
import android.widget.TextView

/**
 * Created by zhangce on 2021/7/5
 */
class ShakeView @JvmOverloads constructor(
    context: Context,
    attributes: AttributeSet? = null,
    defStyleAttr: Int = 0
) : RelativeLayout(context, attributes, defStyleAttr) {
    private lateinit var titleView: TextView
    private lateinit var selectView: RadioButton

    init {

    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        titleView = findViewById(R.id.shake_title)
        selectView = findViewById(R.id.shake_radio)
    }

    public fun setTitle(titleStr: String) {
        titleView.text = titleStr
    }

    public fun setSelectStatus(status: Boolean) {
        selectView.isSelected = status
    }
}