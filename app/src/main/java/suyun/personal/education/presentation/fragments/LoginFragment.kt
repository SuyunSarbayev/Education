package suyun.personal.education.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import suyun.personal.education.R
import suyun.personal.education.presentation.fragments.DetailFragment

class LoginFragment : Fragment() {

    var buttonAction: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = LayoutInflater.from(context).inflate(R.layout.fragment_login, container, false)
        return view
    }

    fun initializeDetailFragment(){
        var detailFragment =
            DetailFragment()

        activity?.supportFragmentManager
            ?.beginTransaction()
            ?.replace(R.id.framelayout_activity_main_fragment_container, detailFragment)
            ?.commit()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonAction = view?.findViewById(R.id.button_activity_main_fill_data)
        buttonAction?.setOnClickListener { initializeDetailFragment() }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }
}