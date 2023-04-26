package com.benatt.androidtemplate.di.modules;

import static com.benatt.androidtemplate.utils.Constants.BASE_URL;

import dagger.Module;
import dagger.Provides;
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author ben-mathu
 * @date 4/26/23
 */
@Module
public class NetworkModule {

    @Provides
    public OkHttpClient provideClient() {
        return new OkHttpClient.Builder()
                .build();
    }

    @Provides
    public Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .client(client)
                .build();
    }
}
