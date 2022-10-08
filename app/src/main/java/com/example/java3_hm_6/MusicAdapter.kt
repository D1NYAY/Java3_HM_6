package com.example.java3_hm_6

import android.view.LayoutInflater

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.java3_hm_6.databinding.ItemMusicBinding


class MusicAdapter() : RecyclerView.Adapter<MusicAdapter.ViewHolder>() {

private var ListMusic = ArrayList<Song>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(ListMusic[position])

    }

    override fun getItemCount(): Int {
        return ListMusic.size
    }
    class ViewHolder (private val binding: ItemMusicBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(song: Song) {
            binding.nameOfSong.text = song.NameOfSong
            binding.number.text = song.number.toString()
            binding.singer.text = song.singer
            binding.time.text = song.time
        }


    }
}