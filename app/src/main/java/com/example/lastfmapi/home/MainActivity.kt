package com.example.lastfmapi.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.lastfmapi.App
import com.example.lastfmapi.R
import com.example.lastfmapi.di.DaggerAppComponent
import com.example.lastfmapi.home.di.DaggerTrackComponent
import com.example.lastfmapi.home.di.TrackModule
import com.example.lastfmapi.model.Track
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(),TrackContract.View {


    private val trackAdapter = TrackAdapter()
    @Inject
    lateinit var trackPresenter: TrackContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerTrackComponent.builder()
            .appComponent((application as App).getComponent())
            .trackModule(TrackModule(this))
            .build()
            .inject(this)

        rvTrack.layoutManager = LinearLayoutManager(this)
        rvTrack.adapter = trackAdapter


        btnFindTrack.setOnClickListener {
            trackPresenter.getTack(etTrack.text.toString())
        }
    }

    override fun showResults(results: List<Track>) {
        trackAdapter.setData(results)
    }

    override fun showError(message: String) {
        Toast.makeText(this,message, Toast.LENGTH_LONG).show()
    }


}
