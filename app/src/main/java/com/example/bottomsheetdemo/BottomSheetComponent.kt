package com.example.bottomsheetdemo

import android.content.Context
import android.support.annotation.NonNull
import android.support.design.widget.BottomSheetBehavior
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.bottom_sheet.view.*
import kotlinx.android.synthetic.main.content_main.view.*


open class BottomSheetComponent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {

    init {
        LayoutInflater.from(context)
            .inflate(R.layout.bottom_sheet, this, true)
        orientation = VERTICAL
    }

    /***
     * overrides the default bottom sheet callbacks for customization
     */
    fun setCallbacks() {
        BottomSheetBehavior.from(component).setBottomSheetCallback(object:BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(@NonNull bottomSheet:View, newState:Int) {
                //TODO any manipulation based on bottom sheet state, if applicable
            }
            override fun onSlide(@NonNull bottomSheet:View, slideOffset:Float) {
                //TODO any manipulation based on bottom sheet slide offset, if applicable
            }
        })
    }

    /**
     * @param title the desired title for the bottom sheet
     */
    fun setTitle(title : String) {
        bottom_sheet_title.text = title
    }

    /**
     * @param sub the desired sub title for the bottom sheet
     */
    fun setSubTitle(sub : String) {
        bottom_sheet_subtitle.text = sub
    }

    /**
     * clears out child views before swapping in the new view
     * @param v the desired view to swap in the scroll view
     */
    fun setContent(v : View) {
        bottom_sheet_scrollview.removeAllViews()
        bottom_sheet_scrollview.addView(v)
    }

}