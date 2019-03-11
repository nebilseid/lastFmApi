package com.example.lastfmapi.model;


public class Track
{
    private Image[] image;

    private String mbid;

    private String listeners;

    private String artist;

    private String streamable;

    private String name;

    private String url;

    public Image[] getImage ()
    {
        return image;
    }

    public void setImage (Image[] image)
    {
        this.image = image;
    }

    public String getMbid ()
    {
        return mbid;
    }

    public void setMbid (String mbid)
    {
        this.mbid = mbid;
    }

    public String getListeners ()
    {
        return listeners;
    }

    public void setListeners (String listeners)
    {
        this.listeners = listeners;
    }

    public String getArtist ()
    {
        return artist;
    }

    public void setArtist (String artist)
    {
        this.artist = artist;
    }

    public String getStreamable ()
    {
        return streamable;
    }

    public void setStreamable (String streamable)
    {
        this.streamable = streamable;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [image = "+image+", mbid = "+mbid+", listeners = "+listeners+", artist = "+artist+", streamable = "+streamable+", name = "+name+", url = "+url+"]";
    }
}
