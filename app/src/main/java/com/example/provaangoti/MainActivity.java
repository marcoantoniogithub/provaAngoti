package com.example.provaangoti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private TextView nome1;
    private TextView value1;
    private TextView nome2;
    private TextView value2;
    private TextView nome3;
    private TextView value3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome1 = findViewById(R.id.textView);
        value1 = findViewById(R.id.textView3);
        nome2 = findViewById(R.id.textView4);
        value2 = findViewById(R.id.textView5);
        nome3 = findViewById(R.id.textView6);
        value3 = findViewById(R.id.textView7);
        buscaDados();
    }

    private void buscaDados() {
        RetrofitService.getServico().obterProdutos().enqueue(new Callback<List<Produto>>() {
            @Override
            public void onResponse(Call<List<Produto>> call, Response<List<Produto>> response) {

            }

            @Override
            public void onFailure(Call<List<Produto>> call, Throwable t) {

            }
        });
    }
}
