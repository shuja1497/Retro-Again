package com.shuja1497.kotlinretrowithrxjava

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    val wikiApiService by lazy {
        WikiApiService.create()
    }

    var disposable: Disposable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        searchCount("barcelona")
    }

    private fun searchCount(search: String) {

        disposable = wikiApiService.getTotalHits("query","json", "search", search)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        {
                            Toast.makeText(this," ${it.query.searchinfo.totalhits} hits",
                                    Toast.LENGTH_LONG).show()
                        },
                        {
                            Toast.makeText(this,it.message.toString(), Toast.LENGTH_LONG).show()
                        }
                )
    }
    override fun onPause() {
        super.onPause()
        disposable?.dispose()
    }
}
