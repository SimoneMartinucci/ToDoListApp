package it.itsacademy.todolistapp.core.app.module

import it.itsacademy.todolistapp.core.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel { HomeViewModel(get()) }
}