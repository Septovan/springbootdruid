package id.tokoonderdil.study.springbootdruid.exception;

public class NoSuchUserException extends Exception {
    public NoSuchUserException() {
        super();
    }

    public NoSuchUserException(String msg) {
        super(msg);
    }
}
