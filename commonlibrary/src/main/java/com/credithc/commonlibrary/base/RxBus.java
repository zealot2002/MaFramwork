package com.credithc.commonlibrary.base;

import com.hwangjr.rxbus.Bus;

/**
 * Created by dell-7020 on 2017/11/15.
 */

public final class RxBus {
    private static Bus sBus;

    public static synchronized Bus get() {
        if (sBus == null) {
            sBus = new Bus();
        }
        return sBus;
    }
}