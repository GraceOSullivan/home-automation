public class FormalEmailDecorator extends EmailDecorator {

    public FormalEmailDecorator(IEmail basicEmail) {
        setEmail(basicEmail);
    }

    @Override
    public String getContents() {
        return addFormalityToEmail(getEmail().getContents());
    }

    private String addFormalityToEmail(String contents) {
        return  "Dear Sir/Madam,\n" + contents + "\nYours Sincerely,\nDaniel.";
    }

}