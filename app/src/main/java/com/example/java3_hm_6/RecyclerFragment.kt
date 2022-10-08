package com.example.java3_hm_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.java3_hm_6.databinding.FragmentRecyclerBinding

class RecyclerFragment : Fragment() {
    private lateinit var binding: FragmentRecyclerBinding
    private val list = arrayListOf<Song>()
    private var adapter = MusicAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecyclerBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadMusic()
        initAdapter()

    }

    private fun loadMusic() {
        list.add(Song("I'm Good", "David Guetta", 1, "3:14"  ))
        list.add(Song("Unholy ", "Sam Smith", 2, "1:04"  ))
        list.add(Song("STAR WALKIN", "LIL Nas X", 3, "2:20"  ))
        list.add(Song("I Like You", "David Guetta", 4, "3:02"  ))
        list.add(Song("Tití Me", "Bunny", 5, "1:10"  ))
    }
    private fun initAdapter(){
       binding.recFirst.adapter = adapter
    }


}