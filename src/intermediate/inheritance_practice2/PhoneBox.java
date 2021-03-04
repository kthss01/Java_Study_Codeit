package intermediate.inheritance_practice2;

public class PhoneBox<T extends Phone> extends Box<T> {

    public void handsFreeCall(String numberString) {
        object.call(numberString);
    }

    public static void main(String[] args) {
        PhoneBox<AndroidPhone> phonbBox = new PhoneBox<>();

        phonbBox.handsFreeCall("김신의");

        AndroidPhone phone = phonbBox.get();
    }
}
