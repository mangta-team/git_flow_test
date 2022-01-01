public class Temp {
    private int id;
    private String value;

    public Test(int id, String value) {
        this.id = id;
        this.value = value;
    }

    private void init() {
        this.id = 3;
        this.value = "끼워넣기";
        System.out.println(id);
    }
}