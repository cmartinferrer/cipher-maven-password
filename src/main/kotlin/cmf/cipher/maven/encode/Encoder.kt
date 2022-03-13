package cmf.cipher.maven.encode

import cmf.cipher.maven.common.CipherConstants.Companion.PASS_PHRASE
import org.sonatype.plexus.components.cipher.DefaultPlexusCipher

class Encoder {

    fun encodePassword(plainPassword: String): String {
        val cipher = DefaultPlexusCipher()
        return cipher.encryptAndDecorate(plainPassword, PASS_PHRASE)
    }
}