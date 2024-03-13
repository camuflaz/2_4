// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Wybierz działanie: 1 - Suma 2 - Różnica 3 - Iloczyn 4 - Iloraz");
    int wybor = scan.nextInt();
    System.out.println("Podaj pierwszą liczbę: ");
    double x = scan.nextDouble();
    System.out.println("Podaj drugą liczbę: ");
    double y = scan.nextDouble();

    switch(wybor){
      case 1:
        System.out.println("Suma: " + (x + y));
        break;
      case 2:
        System.out.println("Różnica: " + (x - y));
        break;
      case 3:
        System.out.println("Iloczyn: " + (x * y));
        break;
      case 4:
        if(y==0){
          System.out.println("Nie można dzielić przez 0");
        }else{
        System.out.println("Iloraz: " + (x / y));
    }
        break;
        
    }
    
  }
}