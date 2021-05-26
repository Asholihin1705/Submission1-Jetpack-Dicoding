package com.example.nobaryuh.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.nobaryuh.Adapter.SectionPagerAdapter
import com.example.nobaryuh.R
import com.example.nobaryuh.databinding.ActivityHomeBinding
import com.synnapps.carouselview.ImageListener

class HomeActivity : AppCompatActivity() {
    private lateinit var activityHomeBinding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)

        val sectionsPagerAdapter = SectionPagerAdapter(this, supportFragmentManager)
        activityHomeBinding.apply {
            viewPager.adapter = sectionsPagerAdapter
            tabLayout.setupWithViewPager(viewPager)
        }
        supportActionBar?.elevation = 0f

        activityHomeBinding.carouselView.pageCount = carouselImages.size
        activityHomeBinding.carouselView.setImageListener(imageListener)
    }

    val carouselImages = intArrayOf(
        R.drawable.poster_crimes,
        R.drawable.poster_spiderman,
        R.drawable.poster_infinity_war,
        R.drawable.poster_mortal_engines
    )

    val imageListener = ImageListener {position, imageView ->
        imageView.setImageResource(carouselImages[position])
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.action_about_me -> {
                val moveIntent = Intent(this, AboutDeveloper::class.java)
                startActivity(moveIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}