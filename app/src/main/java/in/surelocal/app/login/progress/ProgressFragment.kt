package `in`.surelocal.app.login.progress

import `in`.surelocal.app.R
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.progress_fragment.*

class ProgressFragment : Fragment() {

    companion object {
        fun newInstance() = ProgressFragment()
    }

    private lateinit var viewModel: ProgressViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.progress_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ProgressViewModel::class.java)
        progress_fragment_progressBar.setOnClickListener {
            progress_fragment_txt.text="Updating your"
            progress_fragment_txtName.text="performance"
        }
    }

}
