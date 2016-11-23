import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

class SecureEmailDecorator extends EmailDecorator {

    SecureEmailDecorator(IEmail email) {
        setEmail(email);
    }

    public String customiseEmail(String contents) {
        byte[] encrypted = null;
        try {
            String key = "Bar12345Bar12345"; // 128 bit key

            // Create key and cipher
            Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");

            // customiseEmail the text
            cipher.init(Cipher.ENCRYPT_MODE, aesKey);
            encrypted = cipher.doFinal(contents.getBytes());

            // decrypt the text
            //cipher.init(Cipher.DECRYPT_MODE, aesKey);
            //String decrypted = new String(cipher.doFinal(encrypted));
            //System.err.println(decrypted);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException |
                BadPaddingException ex) {
            ex.printStackTrace();
        }

        return new String(encrypted);
    }
}


