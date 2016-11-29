package email;

class FormalEmailDecorator extends EmailDecorator {

    FormalEmailDecorator(IEmail basicEmail) {
        setEmail(basicEmail);
    }

    @Override
    String customiseEmail(String contents) {
        return "Dear Sir/Madam,\n" + contents + "\nYours Sincerely,\nDaniel.";
    }

}