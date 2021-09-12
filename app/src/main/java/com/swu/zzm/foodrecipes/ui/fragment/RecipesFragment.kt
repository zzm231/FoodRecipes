package com.swu.zzm.foodrecipes.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.swu.zzm.foodrecipes.R
import com.swu.zzm.foodrecipes.databinding.FragmentRecipesBinding
import com.swu.zzm.foodrecipes.ui.fragment.adapter.RecipesAdapter
import kotlinx.android.synthetic.main.fragment_recipes.view.*

class RecipesFragment : Fragment() {
    private var _binding: FragmentRecipesBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding  = FragmentRecipesBinding.inflate(inflater,container,false)


        initRecyclerView()

        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    fun initRecyclerView(){
        //binding.recyclerView.showShimmer()
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = RecipesAdapter()
    }


}