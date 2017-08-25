package com.blankj.appframe.injection.module;

import android.app.Activity;

import com.blankj.appframe.injection.PerActivity;

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
public class ActivityModule {

    private final Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @PerActivity
    Activity activity() {
        return mActivity;
    }
}
