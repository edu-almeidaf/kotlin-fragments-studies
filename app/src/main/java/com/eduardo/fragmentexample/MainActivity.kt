package com.eduardo.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity(), View.OnClickListener {
//    private val mFragmentContainer: FragmentContainerView by lazy { findViewById(R.id.main_fcv_container) }
    private val mFragmentOneButton: Button by lazy { findViewById(R.id.main_bt_fragment_one) }
    private val mFragmentTwoButton: Button by lazy { findViewById(R.id.main_bt_fragment_two) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mFragmentOneButton.setOnClickListener(this)
        mFragmentTwoButton.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.main_bt_fragment_one -> {
                val fragmentOne = FragmentOne()

                supportFragmentManager.beginTransaction()
                    .replace(R.id.main_fcv_container, fragmentOne)
                    .commit()
            }

            R.id.main_bt_fragment_two -> {
                val fragmentTwo = FragmentTwo()

                supportFragmentManager.beginTransaction()
                    .replace(R.id.main_fcv_container, fragmentTwo)
                    .commit()
            }
        }
    }
}