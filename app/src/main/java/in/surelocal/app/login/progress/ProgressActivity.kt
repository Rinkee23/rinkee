package `in`.surelocal.app.login.progress

import `in`.surelocal.app.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProgressActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, ProgressFragment.newInstance()).commit()
    }
}
