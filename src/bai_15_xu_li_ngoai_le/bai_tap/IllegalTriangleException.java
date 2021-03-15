package bai_15_xu_li_ngoai_le.bai_tap;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi nhập vào giá trị cạnh: " + super.getMessage();
    }
}
