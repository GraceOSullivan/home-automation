package email;
import misc.Printer;

public class EmailSender {
    private EmailDecorator emailDecorator;

    public void sendAsFormalEmail(IEmail email) {
        Printer.getInstance().print("Sending formal email...");
        emailDecorator = new FormalEmailDecorator(email);
        System.out.println(emailDecorator.getCustomisedDetails(emailDecorator.getContents()));
    }

    public void sendAsSecureEmail(IEmail email) {
        Printer.getInstance().print("Sending secure email(encrypted)...");
        emailDecorator = new SecureEmailDecorator(email);
        System.out.println(emailDecorator.getCustomisedDetails(emailDecorator.getContents()));
    }

    public void sendAsFriendlyEmail(IEmail email) {
        Printer.getInstance().print("Sending email to a colleague...");
        emailDecorator = new ColleagueEmailDecorator(email);
        System.out.println( emailDecorator.getCustomisedDetails(emailDecorator.getContents()));
    }

}