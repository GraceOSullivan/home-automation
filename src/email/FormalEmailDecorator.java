package email;

class FormalEmailDecorator extends EmailDecorator {

    FormalEmailDecorator(IEmail email) {
        super(email);
    }

    @Override
    String customiseEmail(String contents) {
        return "Dear Sir/Madam,\n" + contents + "\nYours Sincerely,\nDaniel.";
    }

}