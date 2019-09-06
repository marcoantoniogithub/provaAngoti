package com.example.provaangoti;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndPoint {

    @GET("produtos")
    Call<List<Produto>> obterProdutos();

}
