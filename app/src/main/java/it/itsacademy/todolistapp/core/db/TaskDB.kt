package it.itsacademy.todolistapp.core.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import it.itsacademy.todolistapp.core.db.converter.TaskConverter
import it.itsacademy.todolistapp.core.db.dao.TaskDAO
import it.itsacademy.todolistapp.core.db.entity.TaskEntity

@Database(entities = [TaskEntity::class], version = 2, exportSchema = false)
@TypeConverters(TaskConverter::class)
abstract class TaskDB : RoomDatabase(){
    abstract fun taskDao() : TaskDAO
}