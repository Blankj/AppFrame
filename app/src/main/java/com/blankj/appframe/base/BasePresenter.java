package com.blankj.appframe.base;

import android.support.annotation.NonNull;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/07/21
 *     desc  : presenter基类
 * </pre>
 */
public class BasePresenter<V extends IView> implements IPresenter<V> {

    private V view;

    @Override
    public void attachView(@NonNull V view) {
        this.view = view;
    }

    @Override
    public void detachView() {

    }

    public V getView() {
        if (view == null) {

        }
        return view;
    }
}
