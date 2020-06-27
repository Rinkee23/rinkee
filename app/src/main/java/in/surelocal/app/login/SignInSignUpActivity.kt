package `in`.surelocal.app.login

import `in`.surelocal.app.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SignInSignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_sign_up)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, SignInSignUpFragment.newInstance()).commit()
    }
}
