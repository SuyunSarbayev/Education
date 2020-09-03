package suyun.personal.education.presentation.dialog

import android.app.Dialog
import android.graphics.Point
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import suyun.personal.education.R

import kotlinx.android.synthetic.main.dialog_login_information.*

class DialogLoginInformation : DialogFragment() {

    var rootView: View? = null

    companion object{
        val TAG = DialogLoginInformation::class.java.name
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return super.onCreateDialog(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.dialog_login_information, container, false)


        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
//        var lp: WindowManager.LayoutParams = WindowManager.LayoutParams()
//        lp.copyFrom(dialog?.window?.attributes)
//        lp.width = 1600
//        lp.height = 1500
//        dialog?.window?.attributes = lp
        var window = dialog?.window
        var point = Point()
        var display = window?.windowManager?.defaultDisplay
        display?.getSize(point)
        var width = point.x
        var height = point.y
        dialog?.window?.setLayout((width * 0.90).toInt(), (height * 0.90).toInt())
        dialog?.window?.setBackgroundDrawableResource(R.color.color_transparent)
        dialog?.setCanceledOnTouchOutside(false)
        dialog?.setCancelable(false)
    }
}