package avatar.com.mymvptestone.java.mvp.base;

/**
 * $desc$
 *
 * @author Frank
 * email xiong.fu@avatarmind.com
 * created 19-4-4 下午1:22.
 */
public interface Presenter<V extends View, M extends Model> {
    /**
     * 注册Model层
     * @param model
     */
    void registerModel(M model);

    /**
     * 注册View层
     * @param view
     */
    void registerView(V view);

    /**
     * 获取View
     * @return
     */
    V getView();

    /**
     * 销毁动作（Activity、Fragment的卸载）
     */
    void destroy();
}
