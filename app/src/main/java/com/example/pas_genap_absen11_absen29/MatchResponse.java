package com.example.pas_genap_absen11_absen29;

import com.google.gson.annotations.SerializedName;

import  java.util.List;
public class MatchResponse {
    @SerializedName("results")
    private List<Match> events;

    public List<Match> getEvents() {
        return events;
    }
}
