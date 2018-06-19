package com.lomoasia.catnews.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

class BaseFragment : Fragment() {

    private var isViewFirstApprar: Boolean = true
    protected lateinit var activity: AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity = this.activity

    }
}