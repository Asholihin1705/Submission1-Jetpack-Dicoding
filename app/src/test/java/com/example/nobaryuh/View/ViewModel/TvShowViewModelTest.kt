package com.example.nobaryuh.View.ViewModel

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class TvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel

    @Before
    fun setUp() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun getDataTvShow() {
        val tvShow = viewModel.getDataTvShow()
        assertNotNull(tvShow)
        assertEquals(10, tvShow.size)
    }
}