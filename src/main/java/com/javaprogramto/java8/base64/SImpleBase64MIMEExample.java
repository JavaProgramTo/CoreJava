package com.javaprogramto.java8.base64;


import java.util.Base64;
import java.util.UUID;

public class SImpleBase64MIMEExample {

    public static void main(String[] args) {

        // adding random  10 UUID values.
        String mimeContent = generateMimeBuffer().toString();

        System.out.println("Original mime buffer length: " + mimeContent.length());

        // Base64 MIME Encode
        Base64.Encoder mimeEncode = Base64.getMimeEncoder();
        String mimeEncodedStr = mimeEncode.encodeToString(mimeContent.getBytes());
        System.out.println("MIME encoded string : " + mimeEncodedStr);

        // Base64 MIME Decode
        Base64.Decoder mimeDecode = Base64.getMimeDecoder();
        String mimeDecodedStr = new String(mimeDecode.decode(mimeEncodedStr.getBytes()));
        System.out.println("MIME decoded string length: " + mimeDecodedStr.length());
    }

    /**
     * Genreates random 10 UUID numbers and adds to the StringBuffer.
     *
     * @return
     */
    private static StringBuffer generateMimeBuffer() {

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 10; i++) {

            buffer.append(UUID.randomUUID());
        }

        return buffer;

    }
}
