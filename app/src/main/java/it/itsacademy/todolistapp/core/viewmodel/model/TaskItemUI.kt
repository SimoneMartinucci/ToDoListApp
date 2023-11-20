package it.itsacademy.todolistapp.core.viewmodel.model

data class TaskItemUI (
    val title : String,
    val priority: Int,
    val expiredDate: String,
    val isCompleted : Boolean
)