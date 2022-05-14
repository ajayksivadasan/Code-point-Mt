package com.aks.codepointmt.di;

import com.aks.codepointmt.utils.RetrofitNetwork;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;

@Module
@InstallIn(SingletonComponent.class)
public class DiModule {
    @Provides
    @Singleton
    public Retrofit providesRetrofit() {
        return RetrofitNetwork.getRetrofitInstance();
    }
}
