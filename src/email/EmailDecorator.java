package email;

abstract class EmailDecorator implements IEmail {
    private IEmail email;

    private IEmail getEmail() {
        return this.email;
    }

    void setEmail(IEmail email) {
        this.email = email;
    }

    @Override
    public String getContents() {
        return getEmail().getContents();
    }

    @Override
    public String getCustomisedDetails(String customisedContents) {
        return getEmail().getCustomisedDetails(customiseEmail(getContents()));
    }

    abstract String customiseEmail(String contents);
}