package com.lomoasia.catnews.mvp

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

abstract class BaseMvpActivity<in V : BaseMvpView, T : BaseMvpPresenter<V>> : AppCompatActivity(), BaseMvpView {

    protected abstract var presenter: T

    override fun getContext(): Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.attachView(this as V)
    }

    override fun showError(error: String?) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
    }

    override fun showError(stringResId: Int) {
        Toast.makeText(this, stringResId, Toast.LENGTH_SHORT).show()
    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun showMessage(strResId: Int) {
        Toast.makeText(this, strResId, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}