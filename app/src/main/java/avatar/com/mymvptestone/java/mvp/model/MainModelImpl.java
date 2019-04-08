package avatar.com.mymvptestone.java.mvp.model;

import android.util.Log;

/**
 * $desc$
 *
 * @author Frank
 * email xiong.fu@avatarmind.com
 * created 19-4-4 下午2:03.
 */
public class MainModelImpl implements MainModel {
    @Override
    public String getDataFromNet() {
        return "MVP 模式,into fragment";
    }

    @Override
    public void stopRequest() {
        Log.i("MainModelImpl", "stop request...");
    }
}
