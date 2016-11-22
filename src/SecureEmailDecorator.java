import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class SecureEmailDecorator extends EmailDecorator {

    public SecureEmailDecorator(IEmail email) {
        setEmail(email);
    }

    @Override
    public String getContents() {
        return encrypt(getEmail().getContents());
    }

    private String encrypt(String contents) {
        byte[] encrypted = null;
        try {
            String key = "Bar12345Bar12345"; // 128 bit key

            // Create key and cipher
            Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");

            // encrypt the text
            cipher.init(Cipher.ENCRYPT_MODE, aesKey);
            encrypted = cipher.doFinal(contents.getBytes());

            // decrypt the text
            //cipher.init(Cipher.DECRYPT_MODE, aesKey);
            //String decrypted = new String(cipher.doFinal(encrypted));
            //System.err.println(decrypted);
        } catch(Exception e) {
            e.printStackTrace();
        }

        return new String(encrypted);
    }
}