package intermediate.inheritance_practice2;

public class Box<T> {
    protected T object;

    public void set(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        String str = "test";
        box.set(str);
        str = box.get();

        Box<Integer> box2 = new Box<>();
        box2.set(10);
        int a = box2.get();

    }
}
