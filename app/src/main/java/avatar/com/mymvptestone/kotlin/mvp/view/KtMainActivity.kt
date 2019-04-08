package avatar.com.mymvptestone.kotlin.mvp.view

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import avatar.com.mymvptestone.R
import avatar.com.mymvptestone.kotlin.mvp.base.BaseMvpActivity
import avatar.com.mymvptestone.kotlin.mvp.model.MainModel
import avatar.com.mymvptestone.kotlin.mvp.model.MainModelImpl
import avatar.com.mymvptestone.kotlin.mvp.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*

class KtMainActivity : BaseMvpActivity<MainModel, MainView, MainPresenter>(),MainView{

    companion object {
        const val TAG = "KtMainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            showToast("模拟网络请求")
            presenter?.getData()
        }
    }
    override fun createModel(): MainModel {
        return MainModelImpl()
    }

    override fun createView(): MainView {
        return this
    }

    override fun createPresenter(): MainPresenter {
        return MainPresenter()
    }

    override fun setData(str: String?) {
        btn.text = str
    }

    override fun showToast(str: String?) {
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show()
    }

    override fun showProgress() {
    }
}
