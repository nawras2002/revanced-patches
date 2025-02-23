package app.revanced.patches.reddit.customclients.syncforreddit.api.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object GetAuthorizationStringFingerprint : MethodFingerprint(
    strings = listOf("authorize.compact?client_id")
)