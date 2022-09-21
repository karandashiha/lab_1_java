/*import java.util.Scanner;
class Sotrudnik{
    String fam, im, otch, doljnost;
    int oklad;
}
public class firma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("¬вед≥ть к≥льк≥сть сп≥вроб≥тник≥в =>");
        int kol = sc.nextInt();
        sc.nextLine();
        Sotrudnik[]sotr = new Sotrudnik[kol];
        System.out.println("¬вед≥ть ≥нформац≥ю про кожного сп≥вроб≥тника:");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i]=new Sotrudnik();
            System.out.print("¬вед≥ть пр≥звище "+(i+1)+" сп≥вроб≥тника => ");
            sotr [i]. fam = sc.nextLine ();
            System.out.print("¬вед≥ть його ≥м`€ =>");
            sotr[i].im=sc.nextLine();
            System.out.print("¬вед≥ть його по батьков≥ =>");
            sotr[i].otch=sc.nextLine();
            System.out.print("¬вед≥ть його посаду =>");
            sotr[i].doljnost=sc.nextLine();
            System.out.print("¬вед≥ть його оклад =>");
            sotr[i].oklad=sc.nextInt();
            sc.nextLine();
    }
        System.out.println("\n—п≥вроб≥тники ф≥рми:\n фам\t≥м`€\tотч\t посада \tќклад");
        for (Sotrudnik s: sotr) {
            System.out.print(s.fam+ "\t"+s.im + "\t"+s.otch
                    +"\t" +s.doljnost +"\t\t"+s.oklad+"\n");
        }
}
}*/
