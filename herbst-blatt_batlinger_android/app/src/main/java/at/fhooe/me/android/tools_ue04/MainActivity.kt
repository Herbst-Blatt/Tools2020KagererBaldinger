package at.fhooe.me.android.tools_ue04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

	Log.d("Main", "Hello World");
    }

    public fun thisisanewMethod() {
        Log.d("new Method", "Hello World");

	Log.d("Main", "This is soooo much fun");
	Log.d("Main", "This is soooo much fun2");
	Log.d("Main", "This is soooo much fun3");
    }
}