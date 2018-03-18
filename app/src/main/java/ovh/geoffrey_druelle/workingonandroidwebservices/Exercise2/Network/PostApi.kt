package ovh.geoffrey_druelle.workingonandroidwebservices.Exercise2.Network

import io.reactivex.Observable
import ovh.geoffrey_druelle.workingonandroidwebservices.Exercise2.Model.Post
import retrofit2.http.GET

/**
 * Created by Geoffrey on 18/03/2018.
 */
interface PostApi {
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}