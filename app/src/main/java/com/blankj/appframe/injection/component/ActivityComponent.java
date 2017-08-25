package com.blankj.appframe.injection.component;

import com.blankj.appframe.injection.PerActivity;
import com.blankj.appframe.injection.module.ActivityModule;

import dagger.Component;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/07/21
 *     desc  :
 * </pre>
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
}
