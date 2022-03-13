package cmf.cipher.maven.encode

import cmf.cipher.maven.decode.Decoder
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class EncoderTest {

    private val encoder = Encoder()
    private val decoder = Decoder()

    @Test
    fun `given plain password when encodePassword then return encoded password and decored`() {
        val passwordEncodedAndDecorated = encoder.encodePassword(PLAIN_PASSWORD)
        val passwordDecoded = decoder.decodePassword(passwordEncodedAndDecorated)

        assertEquals(PLAIN_PASSWORD, passwordDecoded)
    }

    companion object {
        const val PLAIN_PASSWORD = "Hello"
    }

}
