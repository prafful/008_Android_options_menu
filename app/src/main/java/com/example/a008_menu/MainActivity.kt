package com.example.a008_menu

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        Log.i("OBBOMENU", "onCreate: of activity ")
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        /*
        override two methods
        onCreateOptionsMenu
        onOptionItemSelected
         */

        //enable bottom app bar to work as actionbar
        setSupportActionBar(findViewById(R.id.bottomAppBar))

    }

    //inflate the menu. Link menu.xml with this activity
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        Log.i("OBBOMENU", "onCreate: of options menu ")
       //menuInflater.inflate(R.menu.menu, menu)
        menuInflater.inflate(R.menu.bottom_bar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       // Log.i("OBBOMENU", "onOptionsItemSelected: ${item.toString()}")
        when(item.itemId){
            R.id.menuitem1 ->{
                Log.i("OBBOMENU", "onOptionsItemSelected: ${item.toString()}")
                Toast.makeText(this, "Android", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.menuitem2 ->{
                Log.i("OBBOMENU", "onOptionsItemSelected: ${item.toString()}")
                Toast.makeText(this, "Kotlin", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.menuitem3 ->{
                Log.i("OBBOMENU", "onOptionsItemSelected: ${item.toString()}")
                Toast.makeText(this, "Go", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menuitem4 ->{
                Log.i("OBBOMENU", "onOptionsItemSelected: ${item.toString()}")
                Toast.makeText(this, "Node", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menuitem5 ->{
                Log.i("OBBOMENU", "onOptionsItemSelected: ${item.toString()}")
                Toast.makeText(this, "React", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menuitem6 ->{
                Log.i("OBBOMENU", "BottomAppBar: ${item.toString()}")
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menuitem7 ->{
                Log.i("OBBOMENU", "BottomAppBar: ${item.toString()}")
                Toast.makeText(this, "Email", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menuitem8 ->{
                Log.i("OBBOMENU", "BottomAppBar: ${item.toString()}")
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> return super.onOptionsItemSelected(item)

        }
    }
}