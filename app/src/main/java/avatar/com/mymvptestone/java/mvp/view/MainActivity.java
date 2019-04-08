package avatar.com.mymvptestone.java.mvp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import avatar.com.mymvptestone.R;
import avatar.com.mymvptestone.java.mvp.base.BaseMvpActivity;
import avatar.com.mymvptestone.java.mvp.model.MainModel;
import avatar.com.mymvptestone.java.mvp.model.MainModelImpl;
import avatar.com.mymvptestone.java.mvp.presenter.MainPresenter;

/**
 * $desc$
 *
 * @author Frank
 * email xiong.fu@avatarmind.com
 * created 19-4-4 下午1:16.
 */
public class MainActivity extends BaseMvpActivity<MainModel, MainView, MainPresenter> implements
        MainView {

    private Button mBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtn = findViewById(R.id.btn);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (presenter != null) {
                    showToast("模拟网络请求");
                    presenter.getData();
                }
            }
        });
    }

    @Override
    public MainModel createModel() {
        return new MainModelImpl();
    }

    @Override
    public MainView createView() {
        return this;
    }

    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    public void setData(String str) {
        mBtn.setText(str);
    }

    @Override
    public void showToast(String info) {
        Toast.makeText(this, info, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showProgress() {

    }
}
