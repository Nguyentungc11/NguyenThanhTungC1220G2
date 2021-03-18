package case_study.commons;

public class NameException extends Exception {
    public NameException(String string) {
        super(string);
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "at main";
    }
}
