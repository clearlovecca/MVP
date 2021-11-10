package com.bawei.mvp.mvp.view;

import android.view.View;

public interface IFragment extends IActivity{
    <V extends View> V findViewById(int id);
}
