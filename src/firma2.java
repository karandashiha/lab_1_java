import java.util.Scanner;
class Sotrudnik{
    String fam,im,otch, doljnost ;
    int kolDet;
    Rebenok []reb= null;
}
class Rebenok{
    String imaR;
    int vozrastR;
}
public class firma2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("¬вед≥ть к≥льк≥сть сп≥вроб≥тник≥в =>");
        int kol = sc.nextInt();
        sc.nextLine();
        Sotrudnik[] sotr = new Sotrudnik[kol];
        System.out.println("¬вед≥ть ≥нформац≥ю про кожного сп≥вроб≥тника:");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i] = new Sotrudnik();
            System.out.print("¬вед≥ть пр≥звище " + (i + 1) + " сп≥вроб≥тника => ");
            sotr[i].fam = sc.nextLine();
            System.out.print("¬вед≥ть його ≥м`€ =>");
            sotr[i].im = sc.nextLine();
            System.out.print("¬вед≥ть його по батьков≥ =>");
            sotr[i].otch = sc.nextLine();
            System.out.print("¬вед≥ть його посаду =>");
            sotr[i].doljnost = sc.nextLine();
            System.out.print("¬вед≥ть к≥льк≥сть д≥тей =>");
            sotr[i].kolDet = sc.nextInt();
            sc.nextLine();
            if (sotr[i].kolDet!= 0) {
                sotr[i].reb = new Rebenok[sotr[i].kolDet];
                System.out.println("ƒ≥ти =>");
                for (int j = 0; j < sotr[i].reb.length; j++) {
                    sotr[i].reb[j] = new Rebenok();
                    System.out.print("¬вед≥ть ≥м`€ " + (i + 1) + " дитини =>");
                    sotr[i].reb[j].imaR = sc.nextLine();
                    System.out.print("¬вед≥ть його в≥к =>");
                    sotr[i].reb[j].vozrastR = sc.nextInt();
                    sc.nextLine();
                }
            }
        }
        System.out.println("\n—п≥вроб≥тники ф≥рми \n фам \t ≥м`€ \t отч \t посада");
        for(Sotrudnik s: sotr) {
            System.out.print(s.fam+"\t"+s.im + "\t"+ s.otch+ "\t"+ s.doljnost);
            System.out.println("\nƒ≥ти: ");
            for(Rebenok r: s.reb)
                System.out.println("\t\t"+ r.imaR+ "\t\t"+ r.vozrastR);
            System.out.println("");
        }
    }
}