package email;
import misc.Printer;

public class EmailSender {
    private EmailDecorator emailDecorator;

    public void sendAsFormalEmail(IEmail email) {
        Printer.getInstance().print("Sending formal email...");
        emailDecorator = new FormalEmailDecorator(email);
        Printer.getInstance().print(decoratedEmail());
    }

    public void sendAsSecureEmail(IEmail email) {
        Printer.getInstance().print("Sending secure email(encrypted)...");
        emailDecorator = new SecureEmailDecorator(email);
        Printer.getInstance().print(decoratedEmail());
    }

    public void sendAsFriendlyEmail(IEmail email) {
        Printer.getInstance().print("Sending email to a colleague...");
        emailDecorator = new ColleagueEmailDecorator(email);
        Printer.getInstance().print(decoratedEmail());
    }

    private String decoratedEmail() {
        return emailDecorator.getCustomisedDetails(emailDecorator.getContents());
    }
}