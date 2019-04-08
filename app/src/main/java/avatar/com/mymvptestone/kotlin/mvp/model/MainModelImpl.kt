package avatar.com.mymvptestone.kotlin.mvp.model

import android.util.Log

class MainModelImpl : MainModel {
    companion object {
        const val TAG = "MainModelImpl"
    }

    override fun getDataFromNet(): String {
        return "MVP 模式,into fragment"
    }

    override fun stopRequest() {
        Log.i(TAG, "stop request...");
    }
}