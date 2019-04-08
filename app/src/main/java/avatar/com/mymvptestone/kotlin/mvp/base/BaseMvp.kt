package avatar.com.mymvptestone.kotlin.mvp.base

/**
 * $desc$
 * @author Frank
 * email xiong.fu@avatarmind.com
 * created 19-4-4 下午4:28.
 */
interface BaseMvp<M : Model, V : View, P : BasePresenter<M, V>> {
    fun createModel(): M
    fun createView(): V
    fun createPresenter(): P?
}