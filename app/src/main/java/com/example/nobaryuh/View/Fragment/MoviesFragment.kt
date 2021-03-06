package com.example.nobaryuh.View.Fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nobaryuh.Adapter.MoviesAdapter
import com.example.nobaryuh.View.ViewModel.MoviesViewModel
import com.example.nobaryuh.databinding.FragmentMoviesBinding

class MoviesFragment : Fragment() {
    companion object{
        private const val TAG = "MoviesFragment"
    }

    private lateinit var fragmentMoviesBinding: FragmentMoviesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentMoviesBinding = FragmentMoviesBinding.inflate(layoutInflater, container, false)
        return fragmentMoviesBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MoviesViewModel::class.java)
            val movies = viewModel.getDataMovies()

            Log.d(TAG, movies.toString())

            val moviesAdapter = MoviesAdapter()
            moviesAdapter.setMovies(movies)
            with(fragmentMoviesBinding.rvMovies){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = moviesAdapter
            }
        }
    }
}