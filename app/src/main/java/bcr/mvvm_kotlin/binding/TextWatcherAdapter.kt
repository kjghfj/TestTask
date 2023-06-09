package bcr.mvvm_kotlin.binding

import android.text.Editable
import android.text.TextWatcher

/**
 * Created by gulam
 */

open class TextWatcherAdapter: TextWatcher {
    override fun afterTextChanged(s: Editable?) {}

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

}