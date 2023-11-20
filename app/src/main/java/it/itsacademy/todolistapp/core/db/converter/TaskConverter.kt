package it.itsacademy.todolistapp.core.db.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import it.itsacademy.todolistapp.core.db.entity.TaskEntity

class TaskConverter {

    @TypeConverter
    fun convertFromJson(json: String) : List<TaskEntity>{
        val listType = object : TypeToken<List<TaskEntity>>(){}.type
        return Gson().fromJson(json,listType)
    }

    @TypeConverter
    fun convertFromTaskList(list: List<TaskEntity>) : String = Gson().toJson(list)

}