import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        int [] array = {-3,-2,-1,0,1,2,3};
        Arrays.stream(array).filter(value -> value<0).forEach(System.out::println);
        int i =(int) Arrays.stream(array).filter(value -> value<0).count();
        System.out.println(i);
    }
}
