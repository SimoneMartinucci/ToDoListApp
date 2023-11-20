package it.itsacademy.todolistapp.core.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import it.itsacademy.todolistapp.core.db.entity.TaskEntity

@Dao
interface TaskDAO {
    @Query("SELECT * FROM taskentity")
    fun getAll() : List<TaskEntity>

    @Insert
    fun insertTask(taskEntity: TaskEntity)

    @Update
    fun updateTask(taskEntity: TaskEntity)

    @Delete
    fun deleteTask(taskEntity: TaskEntity)
}