package com.example.pas_genap_absen11_absen29;

import com.google.gson.annotations.SerializedName;
public class Team {
    @SerializedName("idTeam")
    private String idTeam;

    @SerializedName("strTeam")
    private String strTeam;

    @SerializedName("strBadge")
    private String strBadge;

    public String getIdTeam() {
        return idTeam;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public String getStrBadge() {
        return strBadge;
    }
}
