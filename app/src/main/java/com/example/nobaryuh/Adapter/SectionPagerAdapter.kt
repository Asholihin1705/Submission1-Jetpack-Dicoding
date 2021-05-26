package com.example.nobaryuh.Adapter

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.nobaryuh.R
import com.example.nobaryuh.View.Fragment.MoviesFragment
import com.example.nobaryuh.View.Fragment.TvShowsFragment

class SectionPagerAdapter(private val mContext: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getPageTitle(position: Int): CharSequence? =
        mContext.resources.getString(TAB_TITLES[position])

        companion object {
            @StringRes
            private val TAB_TITLES = intArrayOf(R.string.movies, R.string.tv_shows)
        }

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> MoviesFragment()
                1 -> TvShowsFragment()
                else -> Fragment()
            }
        }

    override fun getCount(): Int = TAB_TITLES.size
}