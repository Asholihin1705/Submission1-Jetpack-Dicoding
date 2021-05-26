package com.example.nobaryuh.View.ViewModel

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class MoviesViewModelTest {

    private lateinit var viewModel: MoviesViewModel

    @Before
    fun setUp() {
        viewModel = MoviesViewModel()
    }

    @Test
    fun getDataMovies() {
        val movie = viewModel.getDataMovies()
        assertNotNull(movie)
        assertEquals(10, movie.size)
    }
}