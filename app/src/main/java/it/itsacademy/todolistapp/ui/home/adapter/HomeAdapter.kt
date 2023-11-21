package it.itsacademy.todolistapp.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import it.itsacademy.todolistapp.R
import it.itsacademy.todolistapp.core.viewmodel.model.TaskItemUI
import it.itsacademy.todolistapp.ui.home.viewholder.HomeViewHolder

class HomeAdapter(private val list: List<TaskItemUI>) : Adapter<HomeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.home_item_layout,parent,false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(list[position])
    }
}