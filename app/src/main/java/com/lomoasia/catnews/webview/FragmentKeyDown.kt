package com.lomoasia.catnews.webview

import android.view.KeyEvent

interface FragmentKeyDown {
    fun onFragmentKeyDown(keyCode: Int, event: KeyEvent): Boolean
}