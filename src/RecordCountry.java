/*import java.util.Scanner;
class Strana {
    String name; // ����� �����
    double square;
}
public class RecordCountry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        // �������� ���������� ��� �����
        System.out.println("������ ������� ���� =>");
        int n=sc.nextInt(); // ������� ����
        Strana country[]=new Strana[n];
        System.out.println("������ ���������� ��� �����: ");
        for(int i = 0; i< country.length; i++) {
            sc.nextLine(); // �������� ������
            country [i] = new Strana ();
            System.out.print("����� "+(i+1)+"-� ����� =>");
            country[i].name=sc.nextLine();
            System.out.print("����� "+(i+1)+"-� ����� =>");
            country[i].square=sc.nextDouble();
        }
        // ��������� �������� ����������
        System.out.println("\n�������������� ����:");
        for (Strana str: country)
            System.out.println(""+str.name+"\t"+str.square +"��� ��. ��");
        // ����� � ������������ ������
        int nommax=0;
        double max=country[nommax].square;
        for (int i = 0; i< country.length; i++) if (country[i].square>max) {
            max = country [i]. square;
            nommax=i;
        }
        System.out.println("\n����� � ������������ ������ :");
        System.out.println(""+country[nommax].name+"\t"+country[nommax].square +"��� ��. ��");
        // ���������� ���� �� ������
        for (int i = 0; i< country.length-1; i++)
        for (int j = 0; j< country.length-1-i; j++)
        if (country[j].square>country[j+1].square){
            Strana rab=country[j];
            country [j] = country [j + 1];
            country [j + 1] = rab;
        }
        System.out.println("\n³����������� ������ �� ������:");
        for (int i = 0; i < country.length; i++) {
            System.out.println(""+country[i].name+"\t"+country[i].square+"���. ��.��");
        }
        // ���������� ���� �� ������
        for (int i = 0; i < country.length-1; i++)
        for (int j = 0; j <country.length-i-1; j++)
        if(country [j].name.compareTo(country[i+1].name)>0){
            Strana rab=country[j];
            country [j] = country [j + 1];
            country [j + 1] = rab;
        }
        System.out.println("\n³����������� ������ �� ������:");
        for (int i = 0; i<country.length; i++) {
            System.out.println(""+country[i].name +"\t"+country[i].square +"���. ��. ��");
        }
        // ����� ����� ��������
        double s=0;
        for (int i = 0; i<country.length; i++)
        s+=country[i].square;
        double sr=s/country.length; ;
        System.out.println("������� ����� ="+sr);
        System.out.println("\n�����, � ������ ����� ��������");
        for (int i = 0; i < country.length; i++) {
            if (country[i].square>sr)
            System.out.println(country[i].name +"\t"+country[i].square +"��� ��.��");
        }
        // ����� �� ������
        sc.nextLine();
        System.out.println("������ ����� ������ �����=>");
        String name=sc.nextLine();
        int nom=1;
        for (int i = 0; i < country.length; i++)
        if (name.equalsIgnoreCase(country[i].name)) nom=i;
        if (nom!=1){
            System.out.println("���� ����� � � ������. ��"
            +country[nom].name+""+country[nom].square+"��� ��. ��");
        }
        else System.out.println("���� ����� ���� � ������");
}
}*/
