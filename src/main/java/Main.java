// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int c = 0;
    int a;
    int b;
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("kalkulator");
    System.out.println("1. Dodawanie");
    System.out.println("2. Odejmowanie");
    System.out.println("3. Mnożenie");
    System.out.println("4. Dzielenie");

    c = myObj.nextInt();

    switch(c){
      case 1:
        wprowadz();
        a = dodawanie(a, b);
        break;
      case 2:
        wprowadz();
        a = odejmowanie(a, b);
        break;
      case 3:
        wprowadz();
        a=mnozenie(a, b);
        break;
      case 4:
        wprowadz();
        a=dzielenie(a, b);
        break;
    }
    system.out.print("wynik: ");
    system.out.print(Integer.toString(a));

  }

  public int dodawanie(int a, int b){
    return a + b;
  }
  public int odejmowanie(int a, int b){
    return a-b;
  }
  public int mnozenie(int a, int b){
    return a*b;
  }
  public int dzielenie(int a, int b){
    if(b)return a/b;
    return 0;
  }
  public void wprowadz(){
    System.out.println("Podaj liczbe a");
    a = myObj.nextInt();
    System.out.println("Podaj liczbe b");
    b = myObj.nextInt();
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}