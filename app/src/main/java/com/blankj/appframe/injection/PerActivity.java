package com.blankj.appframe.injection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/07/21
 *     desc  :
 * </pre>
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {

}
