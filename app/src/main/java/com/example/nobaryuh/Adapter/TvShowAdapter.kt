package com.example.nobaryuh.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.nobaryuh.Data.Cataloque
import com.example.nobaryuh.View.DetailActivity
import com.example.nobaryuh.databinding.ItemTvshowBinding

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {
    private var listTvShow = ArrayList<Cataloque>()

    fun setTvShow(tvShow: List<Cataloque>?) {
        if (tvShow.isNullOrEmpty()) return
        this.listTvShow.clear()
        this.listTvShow.addAll(tvShow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val itemsTvShowBinding =
            ItemTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemsTvShowBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tvShow = listTvShow[position]
        holder.bind(tvShow)
    }

    override fun getItemCount(): Int = listTvShow.size

    inner class TvShowViewHolder(private val binding: ItemTvshowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: Cataloque) {
            with(binding) {
                itemNama.text = tvShow.title
                itemGenre.text = tvShow.genre
                itemRelease.text = tvShow.release
                itemDurasi.text = tvShow.duration
                Glide.with(itemView)
                    .load(tvShow.poster)
                    .into(itemLogo)
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.KEY_MOVIES, tvShow.id)
                    intent.putExtra(DetailActivity.KEY_STATUS, "tvShow")
                    itemView.context.startActivity(intent)
                }
                itemShare.setOnClickListener{
                    val intent = Intent(Intent.ACTION_SEND)
                    intent.putExtra(
                        Intent.EXTRA_TEXT, "The name of the "
                                + tvShow.title + " movie is of the genre "
                                + tvShow.genre + " and the duration of the film "
                                + tvShow.duration
                    )
                    intent.type = "text/plain"
                    itemShare.context.startActivity(Intent.createChooser(intent, "send to"))
                }

            }
        }
    }
}