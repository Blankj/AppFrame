package com.blankj.appframe.base;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/07/20
 *     desc  :
 * </pre>
 */
public interface IPresenter<V extends IView> {

    void attachView(V view);

    void detachView();

}
