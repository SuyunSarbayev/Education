package suyun.personal.education.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import suyun.personal.education.R

class ImageAdapter : PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var view = LayoutInflater.from(container.context).inflate(R.layout.viewholder_student, container, false)
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return (`object` as View) == view
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Все"
            1 -> "По алфавиту"
            else -> "По оценкам"
        }
    }

}