package io.agora.rte

import androidx.annotation.NonNull
import io.agora.rtc.models.ChannelMediaOptions
import io.agora.rtm.ResultCallback

interface IRteChannel {
    fun join(rtcOptionalInfo: String, rtcToken: String, rtmToken: String, rtcUid: Long, rtmUid: String,
             mediaOptions: ChannelMediaOptions, @NonNull callback: ResultCallback<Void>)

    fun leave()

    fun release()
}
