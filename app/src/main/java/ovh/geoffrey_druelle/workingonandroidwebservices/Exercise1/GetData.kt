package ovh.geoffrey_druelle.workingonandroidwebservices.Exercise1

import com.google.gson.annotations.SerializedName

/**
 * Created by Geoffrey on 18/03/2018.
 */
class GetData(
        @SerializedName("origin") val ip: String,
        val url: String) {

}