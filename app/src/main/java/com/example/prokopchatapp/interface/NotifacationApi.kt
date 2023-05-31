package com.example.prokopchatapp.`interface`

import com.example.prokopchatapp.Constants.Constants.Companion.SERVER_KEY
import com.example.prokopchatapp.Constants.Constants.Companion.CONTENT_TYPE
import com.example.prokopchatapp.models.PushNotifications
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface NotifacationApi {

    @Headers("Authorization: key=$SERVER_KEY","Content-type:$CONTENT_TYPE")
    @POST("fcm/send")
    suspend fun postNotification(
        @Body notification:PushNotifications
    ): Response<ResponseBody>
}