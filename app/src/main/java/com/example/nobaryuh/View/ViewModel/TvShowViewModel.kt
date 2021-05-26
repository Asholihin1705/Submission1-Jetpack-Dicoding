package com.example.nobaryuh.View.ViewModel

import androidx.lifecycle.ViewModel
import com.example.nobaryuh.Data.CatalogDummy
import com.example.nobaryuh.Data.Cataloque

class TvShowViewModel : ViewModel() {
    fun getDataTvShow(): List<Cataloque> = CatalogDummy.catalogueTvShows()
}