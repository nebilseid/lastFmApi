package com.example.lastfmapi.model;


public class OpenSearchQuery
        {
private String startPage;

private String text;

private String role;

public String getStartPage ()
        {
        return startPage;
        }

public void setStartPage (String startPage)
        {
        this.startPage = startPage;
        }

public String getText ()
        {
        return text;
        }

public void setText (String text)
        {
        this.text = text;
        }

public String getRole ()
        {
        return role;
        }

public void setRole (String role)
        {
        this.role = role;
        }

@Override
public String toString()
        {
        return "ClassPojo [startPage = "+startPage+", #text = "+text+", role = "+role+"]";
        }
        }
