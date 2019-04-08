package avatar.com.mymvptestone.java.mvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * $desc$
 *
 * @author Frank
 * email xiong.fu@avatarmind.com
 * created 19-4-4 下午1:46.
 */
public abstract class BaseMvpActivity<M extends Model, V extends View, P extends BasePresenter>
        extends AppCompatActivity implements BaseMvp<M, V, P> {
    public P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = createPresenter();
        if (presenter != null){
            presenter.registerModel(createModel());
            presenter.registerView(createView());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null){
            presenter.destroy();
        }
    }
}
