class EmailSender {
    private EmailDecorator emailDecorator;

    void sendAsFormalEmail(IEmail email) {
        Printer.getInstance().print("Sending formal email...");
        emailDecorator = new FormalEmailDecorator(email);
        System.out.println(emailDecorator.getCustomisedDetails(emailDecorator.getContents()));
    }

    void sendAsSecureEmail(IEmail email) {
        Printer.getInstance().print("Sending secure email(encrypted)...");
        emailDecorator = new SecureEmailDecorator(email);
        System.out.println(emailDecorator.getCustomisedDetails(emailDecorator.getContents()));
    }

    void sendAsFriendlyEmail(IEmail email) {
        Printer.getInstance().print("Sending email to a colleague...");
        emailDecorator = new ColleagueEmailDecorator(email);
        System.out.println( emailDecorator.getCustomisedDetails(emailDecorator.getContents()));
    }

}