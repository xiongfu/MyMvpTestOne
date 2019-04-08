package avatar.com.mymvptestone.kotlin.mvp.base

/**
 * $desc$
 * @author Frank
 * email xiong.fu@avatarmind.com
 * created 19-4-4 下午3:48.
 */
interface Presenter<M : Model, V : View> {
    fun registerModel(model: M?)
    fun registerView(view: V?)
    fun getView():V?
    fun destroy()
}