package android.com.swoosh

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    val TAG = "lifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "${javaClass.simpleName} OnCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "${javaClass.simpleName} OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "${javaClass.simpleName} OnResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "${javaClass.simpleName} OnRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "${javaClass.simpleName} OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "${javaClass.simpleName} OnSop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "${javaClass.simpleName} OnDestroy")
    }
}
