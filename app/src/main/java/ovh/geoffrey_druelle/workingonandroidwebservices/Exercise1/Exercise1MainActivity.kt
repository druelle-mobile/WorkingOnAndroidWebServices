package ovh.geoffrey_druelle.workingonandroidwebservices.Exercise1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ovh.geoffrey_druelle.workingonandroidwebservices.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class Exercise1MainActivity : AppCompatActivity() {

    val TAG = "Exercise1MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example with ScalarsConverter
        val retrofit = Retrofit.Builder()
                .baseUrl("http://httpbin.org")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build()

        val service: HttpBinServiceString = retrofit.create(HttpBinServiceString::class.java)

        val call:Call<String> = service.getUserAgent()

        call.enqueue(object: Callback<String> {
            override fun onFailure(call: Call<String>?, t: Throwable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<String>?, response: Response<String>?) {
                Log.i(TAG, "User agent response: ${response?.body()}")
            }
        })


        // Example with JSON
        val retrofitJson = Retrofit.Builder()
                .baseUrl("http://httpbin.org")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val serviceJson: HttpBinServiceJson = retrofitJson.create(HttpBinServiceJson::class.java)

        val callJson = serviceJson.getUserInfo()

        callJson.enqueue(object: Callback<GetData> {
            override fun onFailure(call: Call<GetData>?, t: Throwable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<GetData>?, response: Response<GetData>?) {
                val getData = response?.body()
                Log.i(TAG, "Received url: ${getData?.url}")
            }

        })
    }
}
