package ovh.geoffrey_druelle.workingonandroidwebservices.Exercise2.Base

/**
 * Created by Geoffrey on 18/03/2018.
 */
abstract class BasePresenter<out V: BaseView>(protected val view: V) {
    init {
        @Suppress("LeakingThis")
        inject()
    }

    abstract fun inject()

    open fun onViewCreated(){}

    open fun onViewDestroyed(){}

}