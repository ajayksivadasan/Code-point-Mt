package com.aks.codepointmt.di.module;

import com.aks.codepointmt.di.scope.RetrofitInterface;
import com.aks.codepointmt.ui.main.MainRepository;
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

    @Provides
    @Singleton
    public RetrofitInterface providesRetrofitInterface(Retrofit retrofit) {
        return retrofit.create(RetrofitInterface.class);
    }

    @Provides
    @Singleton
    public MainRepository providesMainRepository(RetrofitInterface retrofitInterface) {
        return MainRepository.getInstance(retrofitInterface);
    }
}
