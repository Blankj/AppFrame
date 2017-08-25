package com.blankj.appframe.injection.module;

import android.content.Context;

import com.blankj.appframe.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/07/21
 *     desc  :
 * </pre>
 */
@Module
public class ApplicationModule {

    private final App mApp;

    public ApplicationModule(App app) {
        mApp = app;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.mApp;
    }


}
