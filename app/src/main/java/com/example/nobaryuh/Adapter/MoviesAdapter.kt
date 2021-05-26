package com.example.nobaryuh.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.nobaryuh.Data.Cataloque
import com.example.nobaryuh.View.DetailActivity
import com.example.nobaryuh.databinding.ItemMoviesBinding

class MoviesAdapter : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {
    private var listMovies = ArrayList<Cataloque>()

    fun setMovies(movies: List<Cataloque>?) {
        if (movies.isNullOrEmpty()) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val itemsMoviesBinding =
            ItemMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MoviesViewHolder(itemsMoviesBinding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val movies = listMovies[position]
        holder.bind(movies)
    }

    override fun getItemCount(): Int = listMovies.size

    inner class MoviesViewHolder(private val binding: ItemMoviesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movies: Cataloque) {
            with(binding) {
                itemNama.text = movies.title
                itemGenre.text = movies.genre
                itemDurasi.text = movies.duration
                Glide.with(itemView)
                    .load(movies.poster)
                    .into(itemLogo)
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.KEY_MOVIES, movies.id)
                    intent.putExtra(DetailActivity.KEY_STATUS, "movies")
                    itemView.context.startActivity(intent)
                }
                itemShare.setOnClickListener{
                    val intent = Intent(Intent.ACTION_SEND)
                    intent.putExtra(
                        Intent.EXTRA_TEXT, "The name of the "
                                + movies.title + " movie is of the genre "
                                + movies.genre + " and the duration of the film "
                                + movies.duration
                    )
                    intent.type = "text/plain"
                    itemShare.context.startActivity(Intent.createChooser(intent, "send to"))
                }

            }
        }
    }
}