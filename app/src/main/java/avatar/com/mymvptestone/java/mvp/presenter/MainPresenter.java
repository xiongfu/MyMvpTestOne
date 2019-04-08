package avatar.com.mymvptestone.java.mvp.presenter;

import avatar.com.mymvptestone.java.mvp.base.BasePresenter;
import avatar.com.mymvptestone.java.mvp.model.MainModel;
import avatar.com.mymvptestone.java.mvp.view.MainView;

/**
 * $desc$
 *
 * @author Frank
 * email xiong.fu@avatarmind.com
 * created 19-4-4 下午2:07.
 */
public class MainPresenter extends BasePresenter<MainModel,MainView> {

    public void getData(){
        String dataStr = null;
        if (model != null){
            dataStr = model.getDataFromNet();
        }
        if (getView() != null){
            getView().setData(dataStr);
        }
    }

    @Override
    public void onViewDestroy() {
        if (model != null){
                model.stopRequest();
        }
    }
}
