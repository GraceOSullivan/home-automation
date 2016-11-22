class FormalEmailDecorator extends EmailDecorator {

    FormalEmailDecorator(IEmail basicEmail) {
        setEmail(basicEmail);
    }

    @Override
    public String getDetails() {
        return addFormalityToEmailContents(getEmail().getDetails());
    }

    @Override
    public String getContents() {
        return getEmail().getContents();
    }

    @Override
    public void setContents(String contents) {
        getEmail().setContents(addFormalityToEmailContents(getEmail().getContents()));
    }

    private String addFormalityToEmailContents(String contents) {
        return "Dear Sir/Madam,\n" + contents + "\nYours Sincerely,\nDaniel.";
    }

}