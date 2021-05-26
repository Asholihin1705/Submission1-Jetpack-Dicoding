package com.example.nobaryuh.View

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.core.app.ShareCompat
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.nobaryuh.Data.Cataloque
import com.example.nobaryuh.R
import com.example.nobaryuh.View.ViewModel.DetailViewModel
import com.example.nobaryuh.databinding.ActivityDetailBinding

class DetailActivity() : AppCompatActivity() {
    private lateinit var bindingDetail: ActivityDetailBinding

    companion object {
        const val KEY_MOVIES = "extra_movies"
        const val KEY_STATUS = "extra_status"
        const val EXTRA_TITLE_TAB = "movies"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingDetail = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(bindingDetail.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(DetailViewModel::class.java)

        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getString(KEY_MOVIES)
            val movieStatus = extras.getString(KEY_STATUS)
            if (movieId != null) {
                viewModel.setSelectedMovies(movieId)
                if (movieStatus == EXTRA_TITLE_TAB) {
                    populateMoview(viewModel.getMoviesDetail(), movieStatus)
                    supportActionBar?.title = "Movies"
                } else {
                    movieStatus?.let { populateMoview(viewModel.getTvShowsDetail(), it) }
                    supportActionBar?.title = "TvShow"
                }
            }
        }

    }

    @SuppressLint("SetTextI18n")
    private fun populateMoview(movies: Cataloque, movieStatus: String) {
        movies.apply {
            with(bindingDetail) {
                txtGenre.text = genre
                txtTitle.text = title
                txtRelease.text = release
                txtScore.text = score
                txtOverview.text = overview
                txtDirector.text = director
                txtDerasi.text = duration

                if (movieStatus == "movies") {
                    txtDirector.isVisible = true
                    txtLogo.isVisible = true
                } else {
                    txtLogo.isVisible = true
                    txtDerasi.isVisible = true
                    txtGenre.isVisible = true
                    txtRelease.isVisible = true
                    txtScore.isVisible = true
                    txtDirector.isVisible = true
                    txtTitle.isVisible = true
                }

                Glide.with(this@DetailActivity)
                    .load(poster)
                    .transform(RoundedCorners(20))
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_image_loading)
                            .error(R.drawable.ic_image_error)
                    )
                    .into(txtLogo)
            }
        }
    }

    fun shareApp(view: View) {
        val mimeType = "text/plain"
        ShareCompat.IntentBuilder
            .from(this@DetailActivity)
            .setType(mimeType)
            .setChooserTitle("Bagikan Film: \"${view}\" ini sekarang.")
            .startChooser()
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