package avatar.com.mymvptestone.java.mvp.base;

import java.lang.ref.WeakReference;

/**
 * $desc$
 *
 * @author Frank
 * email xiong.fu@avatarmind.com
 * created 19-4-4 下午1:26.
 */
public abstract class BasePresenter<M extends Model, V extends View> implements Presenter<V,M> {

    protected M model;

    protected WeakReference<V> wrfView;

    @Override
    public void registerModel(M model) {
        this.model = model;
    }

    @Override
    public void registerView(V view) {
        this.wrfView = new WeakReference<V>(view);
    }

    @Override
    public V getView() {
        return wrfView == null? null : wrfView.get();
    }

    @Override
    public void destroy() {
        if (wrfView != null){
            wrfView.clear();
            wrfView = null;
        }
        onViewDestroy();
    }

    public abstract void onViewDestroy();
}
