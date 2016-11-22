abstract class EmailDecorator implements IEmail {
    private IEmail email;

    IEmail getEmail() {
        return this.email;
    }

    void setEmail(IEmail email) {
        this.email = email;
    }
}