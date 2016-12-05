package email;

abstract class EmailDecorator implements IEmail {
    private IEmail email;

    EmailDecorator(IEmail email) {
        setEmail(email);
    }

    private IEmail getEmail() {
        return this.email;
    }

    private void setEmail(IEmail email) {
        this.email = email;
    }

    abstract String customiseEmail(String contents);

    @Override
    public String getContents() {
        return getEmail().getContents();
    }

    @Override
    public String getCustomisedDetails(String customisedContents) {
        return getEmail().getCustomisedDetails(customiseEmail(getContents()));
    }


}