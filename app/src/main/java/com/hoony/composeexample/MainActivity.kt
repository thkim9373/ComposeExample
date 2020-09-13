package com.hoony.composeexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContent {
//            Greeting("Android")
//        }
        setContent {
            NewStory()
        }
    }

    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello &name!")
    }

    @Preview
    @Composable
    fun PreviewGreeting() {
        Greeting("Android")
    }

    @Composable
    fun NewStory() {
        Text("A day in Shark Fin Cove")
        Text("Davenport, California")
        Text("December 2018")
    }

    @Preview
    @Composable
    fun DefaultPreview() {
        NewStory()
    }
}