package email;
import misc.Printer;

public class EmailSender {
    private EmailDecorator emailDecorator;

    public void sendAsFormalEmail(IEmail email) {
        printSendingEmail("Sending formal email...");
        emailDecorator = new FormalEmailDecorator(email);
        printDecoratedEmail();
    }

    public void sendAsSecureEmail(IEmail email) {
        printSendingEmail("Sending secure email(encrypted)...");
        emailDecorator = new SecureEmailDecorator(email);
        printDecoratedEmail();
    }

    public void sendAsFriendlyEmail(IEmail email) {
        printSendingEmail("Sending email to a colleague...");
        emailDecorator = new ColleagueEmailDecorator(email);
        printDecoratedEmail();
    }

    private String getDecoratedEmail() {
        return emailDecorator.getCustomisedDetails(emailDecorator.getContents());
    }

    private void printSendingEmail(String sendingEmailString) {
        Printer.getInstance().print(sendingEmailString);
    }

    private void printDecoratedEmail() {
        Printer.getInstance().print(getDecoratedEmail());
    }
}