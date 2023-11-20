package it.itsacademy.todolistapp.core.viewmodel.mapper

import it.itsacademy.todolistapp.core.db.entity.TaskEntity
import it.itsacademy.todolistapp.core.viewmodel.model.TaskItemUI

fun TaskEntity.mapToUI() : TaskItemUI{
    return TaskItemUI(
        title,
        priority,
        expiredDate,
        isCompleted
    )
}