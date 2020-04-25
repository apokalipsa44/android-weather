package com.michau.quotes.ui.quotes

import androidx.lifecycle.ViewModel
import com.michau.quotes.data.Quote
import com.michau.quotes.data.QuotesRepository

class QuotesViewModel(private val quotesRepository: QuotesRepository) : ViewModel() {
    fun getQuotes(){
        quotesRepository.getQuotes()
    }

    fun addQuote(quote: Quote){
        quotesRepository.addQuote(quote)
    }
}