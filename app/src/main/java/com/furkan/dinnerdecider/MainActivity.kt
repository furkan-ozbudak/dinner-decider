package com.furkan.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var dinnerList = arrayListOf<String>("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun decideClick(view : View) {
        dinnerText.text = dinnerList.random()
    }

    fun addClick(view : View) {
        var newDinnerOption = dinnerTextBox.text.toString()
        dinnerList.add(newDinnerOption)
        Toast.makeText(this, "$newDinnerOption is added to the dinner options list.",
            Toast.LENGTH_LONG).show()
    }
}
