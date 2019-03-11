package com.example.lastfmapi.model;


public class TrackMatches
{
    private Track[] track;

    public Track[] getTrack ()
    {
        return track;
    }

    public void setTrack (Track[] track)
    {
        this.track = track;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [track = "+track+"]";
    }
}

