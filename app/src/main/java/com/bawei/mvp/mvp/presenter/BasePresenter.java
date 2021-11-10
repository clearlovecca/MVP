package com.bawei.mvp.mvp.presenter;

import com.bawei.lib_core.mvp.model.IModel;
import com.bawei.lib_core.mvp.view.IView;

public class BasePresenter<M extends IModel,V extends IView> implements IPresenter {
    protected M mModel;
    protected V mView;

    public BasePresenter(M mModel, V mView) {
        this.mModel = mModel;
        this.mView = mView;
    }
}
