package com.example.lastfmapi.home.di

import com.example.lastfmapi.Network.LastFmService
import com.example.lastfmapi.home.TrackContract
import com.example.lastfmapi.home.TrackPresenter
import dagger.Module
import dagger.Provides


@Module
class TrackModule(private val view : TrackContract.View){

    @HomeScope
    @Provides
    fun provideFmPresenter (lastFmService: LastFmService):
            TrackContract.Presenter{
        return TrackPresenter(lastFmService,view)
    }

}