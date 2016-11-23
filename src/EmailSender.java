class EmailSender {
    EmailDecorator emailDecorator;

    void sendAsFormalEmail(IEmail email) {
        System.out.println("Sending formal email...");
        emailDecorator = new FormalEmailDecorator(email);
        emailDecorator.setContents(emailDecorator.getContents());
        System.out.println(emailDecorator.getDetails());
    }

    void sendAsSecureEmail(IEmail email) {
        System.out.println("Sending email to a colleague...");
        emailDecorator = new SecureEmailDecorator(email);
        emailDecorator.setContents(emailDecorator.getContents());
        System.out.println(emailDecorator.getDetails());
    }

    void sendAsFriendlyEmail(IEmail email) {
        System.out.println("Sending secure email(encrypted)...");
        emailDecorator = new ColleagueEmailDecorator(email);
        emailDecorator.setContents(emailDecorator.getContents());
        System.out.println(emailDecorator.getDetails());
    }

}