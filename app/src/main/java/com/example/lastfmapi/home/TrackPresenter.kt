package com.example.lastfmapi.home

import com.example.lastfmapi.Network.LastFmService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class TrackPresenter (private val lastFmService: LastFmService,private val view: TrackContract.View)
    :TrackContract.Presenter {
    private val compositeDisposable = CompositeDisposable()

    override fun getTack(track: String) {

        compositeDisposable.add(
            lastFmService.getTrack(track)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())

                .subscribe({ view.showResults(it.results.trackmatches.track?.toList() ?: emptyList()) },
                    { failure -> view.showError(failure?.message ?: "An unknown error happened") })
        )
    }

}
