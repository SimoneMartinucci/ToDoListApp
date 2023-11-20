package it.itsacademy.todolistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import it.itsacademy.todolistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupNavController()
    }

    private fun setupNavController(){
        binding.bottomNavigation.setupWithNavController(getNavController())
    }

    private fun getNavController() : NavController {
        val navHost = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container ) as NavHostFragment
        return navHost.navController
    }
}