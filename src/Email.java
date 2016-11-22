import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    private String emailAddress;
    private String contents;

    Email(String emailAddress, String contents) {
        boolean validEmailAddress = validate(emailAddress);
        if (validEmailAddress){
            this.emailAddress = emailAddress;
        }
        this.contents = contents;
    }

    private static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String toString() {
        return "Email: " + emailAddress + "\nContents: " + contents;
    }
}
