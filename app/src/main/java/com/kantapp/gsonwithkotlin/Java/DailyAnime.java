package com.kantapp.gsonwithkotlin.Java;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Kantapp Inc. on 05-06-2018.
 */
public class DailyAnime
{
    @SerializedName("Title")
    @Expose
    String Title;

    @SerializedName("Thumb")
    @Expose
    String Thumb;

    @SerializedName("Link")
    @Expose
    String Link;

    @SerializedName("Genres")
    @Expose
    String Genres;

    public DailyAnime(String title, String thumb, String link, String genres) {
        Title = title;
        Thumb = thumb;
        Link = link;
        Genres = genres;
    }

    public DailyAnime() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getThumb() {
        return Thumb;
    }

    public void setThumb(String thumb) {
        Thumb = thumb;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public String getGenres() {
        return Genres;
    }

    public void setGenres(String genres) {
        Genres = genres;
    }
}
