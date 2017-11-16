package debug;


import com.alibaba.android.arouter.launcher.ARouter;
import com.credithc.commonlibrary.base.BaseApplication;

public class HomeApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openDebug();
        ARouter.openLog();
        ARouter.init(this);
    }
}
