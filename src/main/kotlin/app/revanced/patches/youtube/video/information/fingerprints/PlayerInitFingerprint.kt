package app.revanced.patches.youtube.video.information.fingerprints


import app.revanced.patcher.fingerprint.MethodFingerprint

object PlayerInitFingerprint : MethodFingerprint(
    strings = listOf(
        "playVideo called on player response with no videoStreamingData."
    ),
)