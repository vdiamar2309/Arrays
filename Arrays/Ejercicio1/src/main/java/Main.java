public class Main {
    static void main(String[] args) {
        int acumulador=0;
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        for (int i : array){
          if (i%2==0){
              acumulador+=i;
          }
        }
        System.out.println(acumulador);
    }
}
