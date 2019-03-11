package com.example.lastfmapi.Network

import com.example.lastfmapi.model.LastFm
import com.example.lastfmapi.model.TrackMatches
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface LastFmService {

    @GET("?method=track.search$API_KEY")
    fun getTrack(@Query("track")track:String): Observable<LastFm>
}