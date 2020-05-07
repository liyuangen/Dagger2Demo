package com.li.dagger2demo.di;

import android.app.Application;
import android.content.Context;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class AppModule {

    @Binds
    abstract Context bindContext(Application application);

    @Singleton
    @Provides
    public static Gson provideGson() {
        return new Gson();
    }
}
