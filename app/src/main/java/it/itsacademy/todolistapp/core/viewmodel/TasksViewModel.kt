package it.itsacademy.todolistapp.core.viewmodel

import androidx.lifecycle.ViewModel
import it.itsacademy.todolistapp.core.db.dao.TaskDAO

class TasksViewModel(private val taskDAO: TaskDAO) : ViewModel() {
}