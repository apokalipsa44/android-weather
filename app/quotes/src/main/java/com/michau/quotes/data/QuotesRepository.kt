package com.michau.quotes.data

class QuotesRepository private constructor(private val quotesDao: FakeQuotesDao){

    fun addQuote(quote: Quote){
        quotesDao.addQuote(quote)
    }

    fun getQuotes(){
        quotesDao.getQuotes()
    }

    companion object {
        @Volatile
        private var instance: QuotesRepository? = null

        fun getInstance(quotesDao: FakeQuotesDao) =
            instance ?: synchronized(this) {
                instance ?: QuotesRepository(quotesDao).also { instance = it }
            }
    }

}