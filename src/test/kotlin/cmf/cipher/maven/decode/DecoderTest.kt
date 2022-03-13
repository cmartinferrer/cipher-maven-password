package cmf.cipher.maven.decode

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.sonatype.plexus.components.cipher.PlexusCipherException
import kotlin.test.assertEquals


class DecoderTest {

    private val decoder = Decoder()

    @Test
    fun `given simple password encoded when decodePassword then return plain password`() {
        val passwordDecoded = decoder.decodePassword(PASSWORD_ENCODED)
        assertEquals(PASSWORD_DECODED, passwordDecoded)
    }

    @Test
    fun `given decorated password encoded when decodePassword then return plain password`() {
        val passwordDecoded = decoder.decodePassword(PASSWORD_ENCODED_DECORATED)
        assertEquals(PASSWORD_DECODED, passwordDecoded)
    }

    @Test
    fun `given invalid password encoded when decodePassword then throw exception`() {
        assertThrows<PlexusCipherException> { decoder.decodePassword(WRONG_PASSWORD_ENCODED) }
    }

    companion object {
        const val PASSWORD_ENCODED = "{vHzsoslS0j0H2QdES6s4fJNe+HcfiVf68dGOdisMmO4=}"
        const val PASSWORD_ENCODED_DECORATED = "{$PASSWORD_ENCODED}"
        const val WRONG_PASSWORD_ENCODED = "eyXXX1yyy2ZZZ="
        const val PASSWORD_DECODED = "Hello"
    }

}
