package com.dl.data

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.dl.data.file.AssetsManager
import com.dl.data.file.WebViewActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    private lateinit var _assertsBtn: Button
    private lateinit var _assertsText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initLayout()
    }

    private fun initLayout() {
        _assertsBtn = assertsBtn
        _assertsText = assertsText
    }

    fun assetsOnclick(view: View) {
        assertsText.text = AssetsManager.getAssetsContent(this)
    }

    fun webViewOnclick(view: View) {
        val intent = Intent(this,WebViewActivity::class.java)
        startActivity(intent)
    }
}