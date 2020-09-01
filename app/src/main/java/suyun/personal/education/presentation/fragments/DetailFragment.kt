package suyun.personal.education.presentation.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import suyun.personal.education.R

class DetailFragment : Fragment() {

    var keyValue: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        keyValue = arguments?.getInt("Key") ?: 0
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = LayoutInflater.from(context).inflate(R.layout.fragment_detail, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("PASSED KEY", keyValue.toString())
    }

    // Activity    {OS}      LIFE CICLE is not controllable by user

    // Fragment    {Activity}    LIFE CICLE is fully controllable by user
}