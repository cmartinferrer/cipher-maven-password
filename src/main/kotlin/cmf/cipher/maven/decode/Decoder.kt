package cmf.cipher.maven.decode

import cmf.cipher.maven.common.CipherConstants.Companion.PASS_PHRASE
import org.sonatype.plexus.components.cipher.DefaultPlexusCipher

class Decoder {

    fun decodePassword(encodedPassword: String): String {
        val cipher = DefaultPlexusCipher()
        return cipher.decryptDecorated(encodedPassword, PASS_PHRASE)
    }

}