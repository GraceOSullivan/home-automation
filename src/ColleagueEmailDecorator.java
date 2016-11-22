class ColleagueEmailDecorator extends EmailDecorator {
    ColleagueEmailDecorator(IEmail basicEmail) {
        setEmail(basicEmail);
    }

    @Override
    public String getDetails() {
        return addFriendlinessToEmail(getEmail().getDetails());
    }

    @Override
    public String getContents() {
        return null;
    }

    @Override
    public void setContents(String contents) {

    }

    private String addFriendlinessToEmail(String contents) {
        return  "What's up bro?\n" + contents + "\nYours best mate,\nDan.";
    }

}
