package avatar.com.mymvptestone.kotlin.mvp.presenter

import android.util.Log
import avatar.com.mymvptestone.kotlin.mvp.base.BasePresenter
import avatar.com.mymvptestone.kotlin.mvp.model.MainModel
import avatar.com.mymvptestone.kotlin.mvp.view.MainView

/**
 * $desc$
 * @author Frank
 * email xiong.fu@avatarmind.com
 * created 19-4-4 下午4:41.
 */
class MainPresenter : BasePresenter<MainModel, MainView>() {

    companion object {
        const val TAG = "MainPresenter"
    }

    fun getData() {
        var dataStr: String? = model?.getDataFromNet()
        Log.d(TAG, dataStr)
        view?.get()?.setData(dataStr)
    }

    override fun onViewDestroy() {
        model?.stopRequest()
    }
}