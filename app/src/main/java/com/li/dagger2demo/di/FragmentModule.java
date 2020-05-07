package com.li.dagger2demo.di;

import com.li.dagger2demo.MainFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract MainFragment mainFragment();
}
