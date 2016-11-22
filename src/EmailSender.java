class EmailSender {
    void sendAsFormalEmail(IEmail email) {
        FormalEmailDecorator formalEmail = new FormalEmailDecorator(email);
        System.out.println(formalEmail.getContents());
    }

    void sendAsSecureEmail(IEmail email) {
        SecureEmailDecorator secureEmail = new SecureEmailDecorator(email);
        System.out.println(secureEmail.getContents());
    }

    void sendAsFriendlyEmail(IEmail email) {
        ColleagueEmailDecorator colleagueEmailDecorator = new ColleagueEmailDecorator(email);
        System.out.println(colleagueEmailDecorator.getContents());
    }

}