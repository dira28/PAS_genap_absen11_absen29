package com.example.pas_genap_absen11_absen29;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("eventslast.php")
    Call<MatchResponse> getLastEvents(@Query("id") String teamId);

    @GET("search_all_teams.php")
    Call<TeamResponse> getSpainLeagueTeams(
            @Query("s") String sport,
            @Query("c") String country
    );
}
