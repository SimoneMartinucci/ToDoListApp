package it.itsacademy.todolistapp.core.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import it.itsacademy.todolistapp.core.db.dao.TaskDAO
import it.itsacademy.todolistapp.core.db.entity.TaskEntity
import it.itsacademy.todolistapp.core.viewmodel.mapper.mapToUI
import it.itsacademy.todolistapp.core.viewmodel.model.TaskItemUI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(private val taskDAO: TaskDAO) : ViewModel() {

    private val _tasksLiveData = MutableLiveData<List<TaskItemUI>>()
    val tasksLiveData = _tasksLiveData

    fun loadTasks(){
        viewModelScope.launch(Dispatchers.IO) {
            val listTasks = taskDAO.getAll().map { it.mapToUI() }
            _tasksLiveData.postValue(listTasks)
        }
    }

    fun insertTask(){
        viewModelScope.launch(Dispatchers.IO){
            val entity = TaskEntity(
                null,"TEST",
                1,
                "13/11/2023",
                false
            )

            taskDAO.insertTask(entity)
            val newList = _tasksLiveData.value?.toMutableList()
            newList?.add(entity.mapToUI())

            _tasksLiveData.postValue(newList ?: emptyList())
        }
    }

}