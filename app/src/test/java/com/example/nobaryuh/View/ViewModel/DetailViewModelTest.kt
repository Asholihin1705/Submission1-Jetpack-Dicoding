package com.example.nobaryuh.View.ViewModel

import com.example.nobaryuh.Data.CatalogDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailViewModelTest {

    private lateinit var detailViewModel: DetailViewModel
    private val catalogMovie = CatalogDummy.catalogueMovies()[0]
    private val catalogTvShow = CatalogDummy.catalogueTvShows()[0]
    private val movieId = catalogMovie.id
    private val tvShowId = catalogTvShow.id

    @Before
    fun setUp() {
        detailViewModel = DetailViewModel()
        detailViewModel.setSelectedMovies(movieId)
        detailViewModel.setSelectedMovies(tvShowId)
    }

    @Test
    fun getMoviesDetail() {
        detailViewModel.setSelectedMovies(catalogMovie.id)
        val movie = detailViewModel.getMoviesDetail()
        assertNotNull(movie)
        assertEquals(catalogMovie.poster, movie.poster)
        assertEquals(catalogMovie.title, movie.title)
        assertEquals(catalogMovie.release, movie.release)
        assertEquals(catalogMovie.genre, movie.genre)
        assertEquals(catalogMovie.duration, movie.duration)
        assertEquals(catalogMovie.score, movie.score)
        assertEquals(catalogMovie.overview, movie.overview)
        assertEquals(catalogMovie.director, movie.director)
    }

    @Test
    fun getTvShowsDetail() {
        detailViewModel.setSelectedMovies(catalogTvShow.id)
        val tvShows = detailViewModel.getTvShowsDetail()
        assertNotNull(tvShows)
        assertEquals(catalogTvShow.poster, tvShows.poster)
        assertEquals(catalogTvShow.title, tvShows.title)
        assertEquals(catalogTvShow.release, tvShows.release)
        assertEquals(catalogTvShow.genre, tvShows.genre)
        assertEquals(catalogTvShow.duration, tvShows.duration)
        assertEquals(catalogTvShow.score, tvShows.score)
        assertEquals(catalogTvShow.overview, tvShows.overview)
        assertEquals(catalogTvShow.director, tvShows.director)
    }
}