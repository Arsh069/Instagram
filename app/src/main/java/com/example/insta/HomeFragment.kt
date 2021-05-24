package com.example.insta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {
    private lateinit var storyAdapter: StoryRecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)
        val recycler_view: RecyclerView = view.findViewById(R.id.recycler_view)

        recycler_view.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            storyAdapter = StoryRecyclerAdapter(requireContext())
            adapter = storyAdapter
        }
        val data2 = storydatasource.createDataSet()
        storyAdapter.submitList(data2)

        return view
    }
}


