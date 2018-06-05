package com.lomoasia.catnews.mvp

interface BaseMvpPresenter<in V : BaseMvpView> {
    fun attachView(view: V)

    fun detachView()
}