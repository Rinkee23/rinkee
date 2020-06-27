package `in`.surelocal.app.splashscreen

import `in`.surelocal.app.MainActivity
import `in`.surelocal.app.R
import `in`.surelocal.app.login.SignInSignUpActivity
import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SplashScreenFragment : Fragment() {

    companion object {
        fun newInstance() = SplashScreenFragment()
    }

    private lateinit var viewModel: SplashScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.splash_screen_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SplashScreenViewModel::class.java)
        Handler().postDelayed({
            val intent = Intent(requireContext(),SignInSignUpActivity::class.java)
            startActivity(intent)
            (requireContext() as MainActivity).finish()
        },3000)
    }

}
