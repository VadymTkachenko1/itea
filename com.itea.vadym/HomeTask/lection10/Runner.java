package HomeTask.lection10;

@Repeat(
        text = "Running",
        count = 3
)
public class Runner {
    static void run () {
        Class<Runner> runnerClass = Runner.class;
        Repeat repeat = runnerClass.getAnnotation(Repeat.class);
        for (int i = 0; i < repeat.count(); i++) {
            System.out.println(repeat.text());
        }
    }

    public static void main(String[] args) {
        run();
    }
}
