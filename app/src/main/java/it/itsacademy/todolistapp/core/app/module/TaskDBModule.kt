package it.itsacademy.todolistapp.core.app.module

import android.app.Application
import androidx.room.Room
import it.itsacademy.todolistapp.core.db.TaskDB
import it.itsacademy.todolistapp.core.db.dao.TaskDAO
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

private const val ROOM_DATABASE_NAME = "task_database"

val taskDBModule = module {

    fun provideTaskDB(application: Application) : TaskDB{
        return Room.databaseBuilder(application, TaskDB::class.java, ROOM_DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    fun provideTaskDAO(taskDB: TaskDB) : TaskDAO{
        return taskDB.taskDao()
    }

    single { provideTaskDB(androidApplication()) }
    single { provideTaskDAO(get()) }

}