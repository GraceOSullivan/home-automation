import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface IEmail {
    String getDetails();
    String getCustomisedDetails(String customisedContents);
    String getContents();
}