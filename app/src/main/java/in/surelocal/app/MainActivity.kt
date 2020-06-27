package `in`.surelocal.app

import `in`.surelocal.app.splashscreen.SplashScreenFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
       .replace(R.id.container, SplashScreenFragment.newInstance()).commit()
    }
}
