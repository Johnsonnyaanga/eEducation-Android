package io.agora.education.impl.stream

import io.agora.education.api.stream.data.EduStreamInfo
import io.agora.education.api.stream.data.VideoSourceType
import io.agora.education.api.user.data.EduUserInfo

internal class StreamInfoImpl(
        streamUuid: String,
        streamName: String,
        videoSourceType: VideoSourceType,
        hasVideo: Boolean,
        hasAudio: Boolean,
        publisher: EduUserInfo
) : EduStreamInfo(streamUuid, streamName, videoSourceType, hasVideo, hasAudio, publisher)
