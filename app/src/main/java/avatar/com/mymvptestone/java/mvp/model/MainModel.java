package avatar.com.mymvptestone.java.mvp.model;

import avatar.com.mymvptestone.java.mvp.base.Model;

/**
 * $desc$
 *
 * @author Frank
 * email xiong.fu@avatarmind.com
 * created 19-4-4 下午1:58.
 */
public interface MainModel extends Model {

    /**
     * 从网络获取数据
     * @return
     */
    String getDataFromNet();

    /**
     * 暂停网络请求
     */
    void stopRequest();
}
