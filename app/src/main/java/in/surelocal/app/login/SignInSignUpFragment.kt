package `in`.surelocal.app.login

import `in`.surelocal.app.R
import `in`.surelocal.app.login.progress.ProgressActivity
import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.opengl.Visibility
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.sign_in_sign_up_fragment.*


class SignInSignUpFragment : Fragment() {

    companion object {
        fun newInstance() = SignInSignUpFragment()
    }

    private lateinit var viewModel: SignInSignUpViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.sign_in_sign_up_fragment, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SignInSignUpViewModel::class.java)

//-----------------------------------Sign In Code----------------------------------

        signIn_SignUp_fragment_btn_SignIn.setOnClickListener {
            val number = signIn_SignUp_fragment_phone.text.toString().trim()
            val password = signIn_SignUp_fragment_password.text.toString().trim()
            signIn_SignUp_fragment_txt2.text = "Sign In to SuperCharge Your SalesForce"
            this.signIn_SignUp_fragment_forgotPassword.text = "Forgot Password?."
            signIn_SignUp_fragment_btn_SignIn.backgroundTintList = requireContext().getColorStateList( R.color.colorAccent);
            signIn_SignUp_fragment_btn_SignUp.backgroundTintList = requireContext().getColorStateList( R.color.white);
            if (number.isEmpty()) {
                signIn_SignUp_fragment_inputLayout.error = "Empty"
                signIn_SignUp_fragment_inputLayout.requestFocus()
            } else if (password.isEmpty()) {
                signIn_SignUp_fragment_inputLayout1.error = "Empty"
                signIn_SignUp_fragment_inputLayout1.requestFocus()
            } else if (number.length != 10) {
                signIn_SignUp_fragment_phone.error = "invalid number"
                signIn_SignUp_fragment_phone.requestFocus()

            } else {
                Toast.makeText(requireContext(), " valid phone number", Toast.LENGTH_SHORT).show();
                startActivity(Intent(requireContext(),ProgressActivity::class.java))

            }
        }
        //---------------------------------------Sign Up code ---------------------------------------
        signIn_SignUp_fragment_btn_SignUp.setOnClickListener {
            val number = signIn_SignUp_fragment_phone.text.toString().trim()
            val password = signIn_SignUp_fragment_password.text.toString().trim()
            signIn_SignUp_fragment_btn_SignUp.backgroundTintList = requireContext().getColorStateList( R.color.colorAccent);
            signIn_SignUp_fragment_btn_SignIn.backgroundTintList = requireContext().getColorStateList( R.color.white);
            signIn_SignUp_fragment_txt2.text = "Sign Up to SuperCharge Your SalesForce"


            signIn_SignUp_fragment_forgotPassword.text = ""
            if (number.isEmpty()) {
                signIn_SignUp_fragment_inputLayout.error = "Empty"
                signIn_SignUp_fragment_inputLayout.requestFocus()
            } else if (password.isEmpty()) {
                signIn_SignUp_fragment_inputLayout1.error = "Empty"
                signIn_SignUp_fragment_inputLayout1.requestFocus()
            } else if (number.length !=10) {
                signIn_SignUp_fragment_phone.error = "invalid number"
                signIn_SignUp_fragment_phone.requestFocus()

            } else {
                Toast.makeText(requireContext(), " valid phone number", Toast.LENGTH_SHORT).show();

            }


        }
        //----------------------------------------animation---------------------------------------

        signIn_SignUp_fragment_logo.animate()
            .translationY(-50f)
            .alpha(1.0f)
            .setDuration(1000)
            .setListener(object : AnimatorListenerAdapter() {

            })
    }
}
