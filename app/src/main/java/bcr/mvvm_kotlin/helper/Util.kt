package bcr.mvvm_kotlin.helper

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

/**
 * Created by gulam
 */

class Util {

    companion object {
        fun hideSoftKeyboard(context: Context, view: View){
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

}