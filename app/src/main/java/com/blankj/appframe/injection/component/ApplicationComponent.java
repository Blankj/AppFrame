package com.blankj.appframe.injection.component;

import com.blankj.appframe.base.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/07/21
 *     desc  :
 * </pre>
 */
@Singleton
@Component(modules = ApplicationComponent.class)
public interface ApplicationComponent {

    void inject(BaseActivity activity);

}
