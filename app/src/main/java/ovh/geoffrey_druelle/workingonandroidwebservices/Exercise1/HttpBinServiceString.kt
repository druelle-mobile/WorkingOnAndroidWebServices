package ovh.geoffrey_druelle.workingonandroidwebservices.Exercise1

import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Geoffrey on 18/03/2018.
 */
interface HttpBinServiceString {
    @GET("user-agent")
    fun getUserAgent() : Call<String>
}