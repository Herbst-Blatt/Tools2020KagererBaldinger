package at.fhooe.me.android.tools_ue04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

	Log.d("Main", "Hello World");

	Log.d("Main", "LoC method 1");
    }

    public fun thisisanewMethod() {
        Log.d("new Method", "Hello World");

	Log.d("Main", "This is soooo much fun");
	
	Log.d("Main", "LoC method 2");

	Log.d("Main", "LoC 2 method 2");
	Log.d("Main", "LoC 3 method 2");

	Log.d("Main", "This is soooo much fun2");
	Log.d("Main", "This is soooo much fun3");
    }

	fun sum(values: IntArray) {
		var sum = 0;
		for (value in values) {
			sum += value;
		}
		return sum;
	}
}