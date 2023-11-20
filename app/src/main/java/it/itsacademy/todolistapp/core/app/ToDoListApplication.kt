package it.itsacademy.todolistapp.core.app

import android.app.Application
import it.itsacademy.todolistapp.core.app.module.appModule
import it.itsacademy.todolistapp.core.app.module.taskDBModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ToDoListApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@ToDoListApplication)
            modules(taskDBModule, appModule)
        }
    }
}