class Email implements IEmail {
    private String destinationEmailAddress;
    private String contents;

    Email(String destinationEmailAddress, String contents) {
        boolean validEmailAddress = validate(destinationEmailAddress);
        if (validEmailAddress){
            this.destinationEmailAddress = destinationEmailAddress;
        }
        this.contents = contents;
    }
    @Override
    public String getContents() {
        return this.contents;
    }

    String getDestinationEmailAddress() {
        return this.destinationEmailAddress;
    }

    public String toString() {
        return "Destination email:\n" + destinationEmailAddress + "\nContents:\n" + contents;
    }
}
