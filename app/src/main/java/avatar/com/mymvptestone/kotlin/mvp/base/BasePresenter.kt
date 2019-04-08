package avatar.com.mymvptestone.kotlin.mvp.base

import java.lang.ref.WeakReference

/**
 * $desc$
 * @author Frank
 * email xiong.fu@avatarmind.com
 * created 19-4-4 下午3:54.
 */
abstract class BasePresenter<M: Model, V: View> : Presenter<M,V>{
    var model: M? = null
    var view: WeakReference<V>? = null

    override fun registerModel(model: M?) {
        this.model = model
    }

    override fun registerView(view: V?) {
        this.view = WeakReference<V>(view)
    }

    override fun getView(): V? {
        return view?.get()
    }

    override fun destroy() {
        view?.clear()
        onViewDestroy()
    }

    abstract fun onViewDestroy()
}