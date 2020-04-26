package com.michau.quotes.ui.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.michau.quotes.R
import com.michau.quotes.utilities.InjectorUtils
import kotlinx.android.synthetic.main.activity_quotes.*
import kotlin.collections.forEach as forEach1

class QuotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)
        initUi()
    }

    fun initUi() {
        val factory = InjectorUtils.provideQuotesViewModelFavtory()
        val viewModel = ViewModelProvider(this, factory).get(QuotesViewModel::class.java)

        viewModel.getQuotes()

    }



}

