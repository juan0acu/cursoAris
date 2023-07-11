package com.example.androidcurso12hrsarist.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.androidcurso12hrsarist.databinding.ItemSuperHeroBinding
import com.squareup.picasso.Picasso

class SuperheroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperHeroBinding.bind(view)

    fun bind(superHeroItemResponse: SuperHeroItemResponse,onItemSelected: (String) -> Unit) {
        binding.tvSuperHeroName.text = superHeroItemResponse.name
        Picasso.get().load(superHeroItemResponse.superheroImage.url).into(binding.ivSuperhero)
        binding.root.setOnClickListener {
            onItemSelected(superHeroItemResponse.superheroId)
        }
    }
}