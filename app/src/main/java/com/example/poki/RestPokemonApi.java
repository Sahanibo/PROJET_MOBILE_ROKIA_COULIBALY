package com.example.poki;

import com.example.poki.Model.RestPokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestPokemonApi {

    @GET("pokemon")
    Call<RestPokemonResponse> getListPokemon();
}