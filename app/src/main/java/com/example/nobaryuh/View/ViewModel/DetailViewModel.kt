package com.example.nobaryuh.View.ViewModel

import androidx.lifecycle.ViewModel
import com.example.nobaryuh.Data.CatalogDummy
import com.example.nobaryuh.Data.Cataloque

class DetailViewModel : ViewModel() {
    private lateinit var moviesId: String

    fun setSelectedMovies(moviesId: String) {
        this.moviesId = moviesId
    }

    fun getMoviesDetail(): Cataloque {
        lateinit var movies: Cataloque
        val moviesEntities = CatalogDummy.catalogueMovies()
        for (moviesEntity in moviesEntities) {
            if (moviesEntity.id == moviesId) {
                movies = moviesEntity
                break
            }
        }
        return movies
    }

    fun getTvShowsDetail(): Cataloque {
        lateinit var tvShow: Cataloque
        val tvShowEntities = CatalogDummy.catalogueTvShows()
        for (tvShowEntity in tvShowEntities) {
            if (tvShowEntity.id == moviesId) {
                tvShow = tvShowEntity
            }
        }
        return tvShow
    }
}