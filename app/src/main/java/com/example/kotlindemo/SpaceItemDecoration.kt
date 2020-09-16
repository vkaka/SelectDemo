package com.example.kotlindemo

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by zhangce on 2020/9/15
 */
class SpaceItemDecoration(space: Int) : RecyclerView.ItemDecoration() {
    var mSpace = space
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        when {
            parent.getChildAdapterPosition(view) % 3 == 0 -> {
                outRect.left = 0
            }
            parent.getChildAdapterPosition(view) % 3 == 1 -> {
                outRect.left = mSpace
            }
            else -> {
                outRect.left = mSpace * 2
            }
        }

        if (parent.getChildAdapterPosition(view) > 3) {
            outRect.top = 0
        } else {
            outRect.top = mSpace
        }
    }
}