package com.example.bottomsheetdemo

import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        component.setCallbacks()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    /**
     * dismissses the bottom sheet when the X button is pressed
     */
    fun dismiss(v : View) {
        val behavior = BottomSheetBehavior.from(component)
        if (!behavior.isHideable) {
            behavior.isHideable = true
        }
        behavior.state = BottomSheetBehavior.STATE_HIDDEN
    }

    /**
     * handles toggling events on button press
     */
    fun toggleSheet(v : View) {
        val behavior = BottomSheetBehavior.from(component)
        if (behavior.state != BottomSheetBehavior.STATE_HIDDEN) {
            if (!behavior.isHideable) {
                behavior.isHideable = true
            }
            behavior.state = BottomSheetBehavior.STATE_HIDDEN
        } else {
            behavior.state = BottomSheetBehavior.STATE_COLLAPSED
        }
    }
}
