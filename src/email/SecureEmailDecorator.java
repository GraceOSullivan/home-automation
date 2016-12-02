package email;

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
        try {
            String key = "Bar12345Bar12345"; // 128 bit key
            Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, aesKey);

            byte[] encrypted = cipher.doFinal(contents.getBytes());

            return new String(encrypted);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException |
                BadPaddingException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}


