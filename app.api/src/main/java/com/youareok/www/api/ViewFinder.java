package com.youareok.www.api;

import android.view.View;

/**
 * ui提供者接口
 */
public interface ViewFinder {

    View findView(Object object, int id);
}