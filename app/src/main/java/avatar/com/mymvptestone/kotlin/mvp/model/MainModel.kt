package avatar.com.mymvptestone.kotlin.mvp.model

import avatar.com.mymvptestone.kotlin.mvp.base.Model

/**
 * $desc$
 * @author Frank
 * email xiong.fu@avatarmind.com
 * created 19-4-4 下午4:41.
 */
interface MainModel : Model {

    fun getDataFromNet(): String
    fun stopRequest()
}