package it.itsacademy.todolistapp.ui.home.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import it.itsacademy.todolistapp.R
import it.itsacademy.todolistapp.core.viewmodel.model.TaskItemUI
import it.itsacademy.todolistapp.databinding.HomeItemLayoutBinding

class HomeViewHolder(view: View) : ViewHolder(view) {
    fun bind(data: TaskItemUI){
        with(HomeItemLayoutBinding.bind(itemView)){
            taskTitleTextview.text = data.title
            priorityTextview.text = itemView.context.resources.getString(R.string.priority_label, data.priority.toString())
            endDateTextview.text =  itemView.context.resources.getString(R.string.end_date_label,data.expiredDate)
        }
    }
}