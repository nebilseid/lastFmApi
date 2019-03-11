package com.example.lastfmapi.home

import com.example.lastfmapi.model.Track


interface TrackContract {
    interface View {
        fun showResults(results:List<Track>)
        fun showError(message: String)
    }

    interface Presenter {
        fun getTack(track:String)
    }
}