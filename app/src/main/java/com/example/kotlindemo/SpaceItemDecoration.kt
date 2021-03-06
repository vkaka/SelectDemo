package com.example.kotlindemo

import android.content.Context
import android.graphics.Rect
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by zhangce on 2020/9/15
 */
class SpaceItemDecoration(context: Context, space: Int) : RecyclerView.ItemDecoration() {
    val mSpace = space
    val mContext = context
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
//                outRect.left = mContext.resources.getDimensionPixelOffset(R.dimen.list_space) / 2
//                outRect.right = mContext.resources.getDimensionPixelOffset(R.dimen.list_space) / 2
        Log.e("zhangce","pos:"+parent.getChildAdapterPosition(view))
        when {
            parent.getChildAdapterPosition(view) % 3 == 0 -> {
                outRect.left = mContext.resources.getDimensionPixelOffset(R.dimen.list_space)
                outRect.right = mContext.resources.getDimensionPixelOffset(R.dimen.list_space) / 2
            }
            parent.getChildAdapterPosition(view) % 3 == 1 -> {
                outRect.left = mContext.resources.getDimensionPixelOffset(R.dimen.list_space) / 2
                outRect.right = mContext.resources.getDimensionPixelOffset(R.dimen.list_space) / 2
            }
            parent.getChildAdapterPosition(view) % 3 == 2 -> {
                outRect.left = mContext.resources.getDimensionPixelOffset(R.dimen.list_space) / 2
                outRect.right = mContext.resources.getDimensionPixelOffset(R.dimen.list_space)
            }
            else -> {
            }
        }

        if (parent.getChildAdapterPosition(view) >= 3) {
            outRect.top = mContext.resources.getDimensionPixelOffset(R.dimen.list_space)
        } else {
            outRect.top = 0
        }
    }
}