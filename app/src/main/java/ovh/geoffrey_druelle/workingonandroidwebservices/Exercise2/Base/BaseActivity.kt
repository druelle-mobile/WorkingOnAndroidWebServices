package ovh.geoffrey_druelle.workingonandroidwebservices.Exercise2.Base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Geoffrey on 18/03/2018.
 */
abstract class BaseActivity<P : BasePresenter<BaseView>> : BaseView, AppCompatActivity() {
    protected lateinit var presenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = instantiatePresenter()
    }

    abstract fun instantiatePresenter(): P
}