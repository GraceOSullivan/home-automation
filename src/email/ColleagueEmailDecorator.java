package email;

class ColleagueEmailDecorator extends EmailDecorator {
    ColleagueEmailDecorator(IEmail email) {
        super(email);
    }

    @Override
    public String customiseEmail(String contents) {
        return "What's up bro?\n" + contents + "\nYours best mate,\nDan.";
    }
}