package it.itsacademy.todolistapp.core.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    @ColumnInfo ("title")
    val title : String,
    @ColumnInfo("priority")
    val priority : Int,
    @ColumnInfo("expired_date")
    val expiredDate: String,
    @ColumnInfo("is_completed")
    val isCompleted: Boolean
)