package com.example.nobaryuh.View.Fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nobaryuh.Adapter.TvShowAdapter
import com.example.nobaryuh.View.ViewModel.TvShowViewModel
import com.example.nobaryuh.databinding.FragmentTvShowsBinding

class TvShowsFragment : Fragment() {
    companion object{
        private const val TAG = "TvShowsFragment"
    }

    private lateinit var fragmentTvBinding: FragmentTvShowsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentTvBinding = FragmentTvShowsBinding.inflate(layoutInflater, container, false)
        return fragmentTvBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
                TvShowViewModel::class.java)
            val tvShow = viewModel.getDataTvShow()

            Log.d(TAG, tvShow.toString())

            val tvShowAdapter = TvShowAdapter ()
            tvShowAdapter.setTvShow(tvShow)
            with(fragmentTvBinding.rvTvshow){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvShowAdapter
            }
        }
    }
}