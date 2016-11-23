import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface IEmail {
    String getDetails();
    String getContents();
    void setContents(String contents);
}