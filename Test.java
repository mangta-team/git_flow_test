public class Test {
    private int id;
    private String value;

    public Test(int id, String value) {
        this.id = id;
        this.value = value;
    }

    private void init() {
<<<<<<< HEAD
        this.id = 1;
        System.out.println("끼워넣기");
        this.value = "hello";
=======
        this.id = 2;
        this.value = "hello2";
>>>>>>> d7c695a (rebase test - 2)
        System.out.println(id);
    }
}