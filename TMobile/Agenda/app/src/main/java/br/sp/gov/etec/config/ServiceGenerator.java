package br.sp.gov.etec.config;

import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    //URL base. Deve sempre terminar com "/"
    public static final String API_BASE_URL = "";

    public static <S> S createService(Class<S> serviceClass){

        //Instância do interceptador das requisições
        HttpLoggingInterceptor loggingInterceptor =
                new HttpLoggingInterceptor();

        //Configura o tempo máximo de espera da requisição(15s)
        OkHttpClient.Builder httpClient =
                new OkHttpClient.Builder()
                        .readTimeout(15, TimeUnit.SECONDS);

        httpClient.addInterceptor(loggingInterceptor);

        //Instância do retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .client(httpClient.build())
                .build();

        return retrofit.create(serviceClass);

    }//fim do createService
}
