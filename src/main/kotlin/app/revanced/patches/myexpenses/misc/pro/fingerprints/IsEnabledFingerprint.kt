package app.revanced.patches.myexpenses.misc.pro.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object IsEnabledFingerprint : MethodFingerprint(
    "Z",
    strings = listOf("feature", "feature.licenceStatus")
)
