import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
int temp;
        // looping loop1 = new looping();
 for (int i = 0; i <= 100; i++) {
    temp = new Random().nextInt(100);
    if (temp<1) {
        System.out.println(temp);
    }
 }
    }
}
