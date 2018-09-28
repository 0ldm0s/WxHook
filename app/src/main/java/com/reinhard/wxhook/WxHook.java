package com.reinhard.wxhook;

import android.util.Log;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * Desc.
 *
 * @author Reinhard（李剑波）
 * @date 2018/9/28
 */
public class WxHook implements IXposedHookLoadPackage {
    private static final String TAG = "WxHook";
    private static final String WX = "com.tencent.mm";

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        if (!WX.equals(lpparam.packageName)) {
            return;
        }
        Log.d(TAG, "handleLoadPackage: processName = " + lpparam.processName);
    }
}
