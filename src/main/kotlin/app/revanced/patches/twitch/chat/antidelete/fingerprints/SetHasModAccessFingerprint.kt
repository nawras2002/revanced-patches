package app.revanced.patches.twitch.chat.antidelete.fingerprints


import app.revanced.patcher.fingerprint.MethodFingerprint

object SetHasModAccessFingerprint : MethodFingerprint(
    customFingerprint = { methodDef, _ ->
        methodDef.definingClass.endsWith("DeletedMessageClickableSpan;") && methodDef.name == "setHasModAccess"
    }
)