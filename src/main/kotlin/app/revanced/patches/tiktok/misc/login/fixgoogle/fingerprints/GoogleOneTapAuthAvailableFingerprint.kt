package app.revanced.patches.tiktok.misc.login.fixgoogle.fingerprints

import app.revanced.patcher.extensions.or
import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.AccessFlags

object GoogleOneTapAuthAvailableFingerprint : MethodFingerprint(
    returnType = "Z",
    accessFlags = AccessFlags.PUBLIC or AccessFlags.FINAL,
    parameters = listOf(),
    customFingerprint = { methodDef, _ ->
        methodDef.definingClass == "Lcom/bytedance/lobby/google/GoogleOneTapAuth;"
    }
)