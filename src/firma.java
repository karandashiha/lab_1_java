/*import java.util.Scanner;
class Sotrudnik{
    String fam, im, otch, doljnost;
    int oklad;
}
public class firma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("������ ������� ����������� =>");
        int kol = sc.nextInt();
        sc.nextLine();
        Sotrudnik[]sotr = new Sotrudnik[kol];
        System.out.println("������ ���������� ��� ������� �����������:");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i]=new Sotrudnik();
            System.out.print("������ ������� "+(i+1)+" ����������� => ");
            sotr [i]. fam = sc.nextLine ();
            System.out.print("������ ���� ��`� =>");
            sotr[i].im=sc.nextLine();
            System.out.print("������ ���� �� ������� =>");
            sotr[i].otch=sc.nextLine();
            System.out.print("������ ���� ������ =>");
            sotr[i].doljnost=sc.nextLine();
            System.out.print("������ ���� ����� =>");
            sotr[i].oklad=sc.nextInt();
            sc.nextLine();
    }
        System.out.println("\n����������� �����:\n ���\t��`�\t���\t ������ \t�����");
        for (Sotrudnik s: sotr) {
            System.out.print(s.fam+ "\t"+s.im + "\t"+s.otch
                    +"\t" +s.doljnost +"\t\t"+s.oklad+"\n");
        }
}
}*/
