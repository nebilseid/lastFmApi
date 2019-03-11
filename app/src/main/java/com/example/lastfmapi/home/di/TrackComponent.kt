package com.example.lastfmapi.home.di

import com.example.lastfmapi.di.AppComponent
import com.example.lastfmapi.home.MainActivity
import dagger.Component


@Component(dependencies = [AppComponent::class],modules =[TrackModule::class])
@HomeScope

interface TrackComponent {
    fun inject (mainActivity: MainActivity)
}