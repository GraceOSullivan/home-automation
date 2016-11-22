class ColleagueEmailDecorator extends EmailDecorator {

    ColleagueEmailDecorator(IEmail basicEmail) {
        setEmail(basicEmail);
    }

    @Override
    public String getDetails() {
        return addFriendlinessToEmail(getEmail().getDetails());
    }

    private String addFriendlinessToEmail(String contents) {
        return  "What's up bro?\n" + contents + "\nYours best mate,\nDan.";
    }

}
