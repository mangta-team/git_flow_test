public class Test {
    private int id;
    private String value;

    public Test(int id, String value) {
        this.id = id;
        this.value = value;
    }

    private void init() {
        this.id = 1;
        System.out.println("끼워넣기");
        this.value = "hello";
        System.out.println(id);
    }
}