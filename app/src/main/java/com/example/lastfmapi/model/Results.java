package com.example.lastfmapi.model;


public class Results
{
    private TrackMatches trackmatches;

    public TrackMatches getTrackmatches ()
    {
        return trackmatches;
    }

    public void setTrackmatches (TrackMatches trackmatches)
    {
        this.trackmatches = trackmatches;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [trackmatches = "+trackmatches+"]";
    }
}