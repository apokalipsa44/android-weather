package com.michau.quotes.utilities

import com.michau.quotes.data.FakeDatabase
import com.michau.quotes.data.FakeQuotesDao
import com.michau.quotes.data.QuotesRepository
import com.michau.quotes.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFavtory():QuotesViewModelFactory{
        val quotesRepository=QuotesRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quotesRepository)
    }
}