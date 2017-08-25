package com.blankj.appframe.base;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/07/20
 *     desc  :
 * </pre>
 */
public interface IView<T extends IPresenter> {

    void setPresenter(T presenter);

}
