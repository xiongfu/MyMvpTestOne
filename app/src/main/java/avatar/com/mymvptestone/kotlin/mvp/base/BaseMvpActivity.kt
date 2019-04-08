package avatar.com.mymvptestone.kotlin.mvp.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * $desc$
 * @author Frank
 * email xiong.fu@avatarmind.com
 * created 19-4-4 下午4:33.
 */
abstract class BaseMvpActivity<M : Model, V : View, P : BasePresenter<M, V>> : AppCompatActivity(), BaseMvp<M, V, P> {
    companion object {
        const val TAG = "BaseMvpActivity"
    }

    var presenter: P? = null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createPresenter()
        Log.d(TAG, "presenter = " + presenter)
        presenter?.registerModel(createModel())
        presenter?.registerView(createView())
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.destroy()
    }
}