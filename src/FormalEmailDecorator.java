class FormalEmailDecorator extends EmailDecorator {

    FormalEmailDecorator(IEmail basicEmail) {
        setEmail(basicEmail);
    }

    @Override
    public String getDetails() {
        return getEmail().getDetails();
    }

    private String addFormalityToEmailContents(String contents) {
        return  "Dear Sir/Madam,\n" + contents + "\nYours Sincerely,\nDaniel.";
    }

}