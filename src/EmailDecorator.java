abstract class EmailDecorator implements IEmail {
    private IEmail email;

    IEmail getEmail() {
        return this.email;
    }

    void setEmail(IEmail email) {
        this.email = email;
    }

    @Override
    public String getDetails() {
        return getEmail().getDetails();
    }

    public String getContents() {
        return customiseEmail(getEmail().getContents());
    }

    public void setContents(String contents) {
        getEmail().setContents(customiseEmail(getEmail().getContents()));
    }

    abstract String customiseEmail(String contents);
}