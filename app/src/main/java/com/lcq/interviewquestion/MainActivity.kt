package com.lcq.interviewquestion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.MenuItem
import com.lcq.interviewquestion.utils.FragmentUtils
import com.lcq.interviewquestion.weight.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //当前显示的Fragment
    private var mContent: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttomnavigation.setOnNavigationItemSelectedListener(MyOnNavigationItemSelectedListener())
        BottomNavigationViewHelper.disableShiftMode(buttomnavigation)
        buttomnavigation.setItemIconTintList(null);
        val item: MenuItem = buttomnavigation.menu.getItem(0)
        creatFragment(item)
    }

    inner class MyOnNavigationItemSelectedListener : BottomNavigationView.OnNavigationItemSelectedListener {
        override fun onNavigationItemSelected(item: MenuItem): Boolean {
            creatFragment(item)
            return true
        }
    }

    private fun creatFragment(item: MenuItem) {
        switchFrament(mContent, FragmentUtils.fragmentUtils.getFragment(item.itemId))
    }

    /**
     * Fragment切换
     */
    private fun switchFrament(from: Fragment?, to: Fragment?) {
        if (from != to) {
            mContent = to!!
            val ft = supportFragmentManager.beginTransaction()
            //才切换
            //判断有没有被添加
            if (!to!!.isAdded) {
                //to没有被添加
                //from隐藏
                if (from != null) {
                    ft.hide(from)
                }
                //添加to
                ft.add(R.id.container, to).commit()
            } else {
                //to已经被添加
                // from隐藏
                if (from != null) {
                    ft.hide(from)
                }
                //显示to
                ft.show(to).commit()
            }
        }

    }
}
