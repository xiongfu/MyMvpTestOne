package avatar.com.mymvptestone.java.mvp.base;

/**
 * $desc$
 *
 * @author Frank
 * email xiong.fu@avatarmind.com
 * created 19-4-4 下午1:39.
 */
public interface BaseMvp<M extends Model, V extends View, P extends BasePresenter> {
    /**
     * 创建model
     *
     * @return
     */
    M createModel();

    /**
     * 创建View
     *
     * @return
     */
    V createView();

    /**
     * 创建Presenter
     *
     * @return
     */
    P createPresenter();
}
