package it.itsacademy.todolistapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import it.itsacademy.todolistapp.R
import it.itsacademy.todolistapp.core.viewmodel.HomeViewModel
import it.itsacademy.todolistapp.databinding.FragmentHomeBinding
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding
    private val homeViewModel : HomeViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        homeViewModel.tasksLiveData.observe(this){ list ->
            binding.loadingProgress.isVisible = false
            binding.successView.isVisible = list.isNotEmpty()
            binding.emptyLayout.root.isVisible = list.isEmpty()

            if(list.isNotEmpty()){
                binding.taskRecyclerview.apply {

                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        homeViewModel.loadTasks()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            emptyLayout.subtitle1Textview.text =
                resources.getString(R.string.home_empty_subtitle1)
            emptyLayout.subtitle2Textview.text =
                resources.getString(R.string.home_empty_subtitle2)

            buttonFab.setOnClickListener {
                homeViewModel.insertTask()
            }
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = HomeFragment()

    }
}