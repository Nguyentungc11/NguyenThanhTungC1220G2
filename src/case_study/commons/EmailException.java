package case_study.commons;

public class EmailException extends Exception {
    public EmailException(String  string) {
        super(string);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
