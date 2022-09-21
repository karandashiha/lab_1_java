import java.util.Scanner;
class Teams {
    String name_team,city;
    double place_in_league,number_of_wins;
}public class footballteams1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("������ ������� ���������� ������ =>");
        int n=sc.nextInt();
        Teams[]team=new Teams[n];
        System.out.println("������ ���������� ��� ��������� �������: ");
        for(int i = 0; i< team.length; i++) {
            sc.nextLine(); // �������� ������
            team [i] = new Teams ();
            System.out.print("����� "+(i+1)+"-������ =>");
            team[i].name_team=sc.nextLine();
            System.out.print("̳��� "+(i+1)+"-������� =>");
            team[i].city=sc.nextLine();
            System.out.print("̳��� � �� "+(i+1)+"-������� =>");
            team[i].place_in_league=sc.nextDouble();
            System.out.print("ʳ������ ������� "+(i+1)+"-������� =>");
            team[i].number_of_wins=sc.nextDouble();
        }

        // ��������� �������� ����������
        System.out.println("\n����� ����������:");
        for (Teams str: team)
            System.out.println(""+str.name_team+"\t"+str.city +"\t"+str.place_in_league+"\t"+str.number_of_wins);

        // ������� � ��������� ������� �������
        int winmax=0;
        double max=team[winmax].number_of_wins;
        for (int i = 0; i< team.length; i++) if (team[i].number_of_wins>max) {
            max = team [i].number_of_wins;
            winmax=i;
        }
        System.out.println("\n������� � ��������� ������� ������� :");
        System.out.println(""+team[winmax].name_team+"\t"+team[winmax].number_of_wins);
        // ������� � ������� ������� ����� ����������
        double s=0;
        for (int i = 0; i<team.length; i++)
            s+=team[i].number_of_wins;
        double sr=s/team.length; ;
        System.out.println("������� ������� ������� ="+sr);
        System.out.println("\n������� � ������� ������� ����� ����������");
        for (int i = 0; i < team.length; i++) {
            if (team[i].number_of_wins>sr)
                System.out.println(team[i].name_team +"\t"+team[i].number_of_wins );
        }

        // ������������ ����� � ��������� ���� � ��
        for (int i = 0; i >team.length-1; i++)
            for (int j = 0; j >team.length-1-i; j++)
                if (team[j].place_in_league<team[j+1].place_in_league){
                    Teams rab=team[j];
                    team[j]=team[j+1];
                    team[j+1]=rab;
                }
        System.out.println("����������� ����� � ��������� ���� � ��");
        for (Teams value : team) {
            System.out.println(""+value.name_team+"\t"+value.place_in_league);}

        // ����� ������� �� ������
        sc.nextLine();
        System.out.println("������ ����� ������ �������=>");
        String name=sc.nextLine();
        int no=-1;
        for (int i = 0; i < team.length; i++)
            if (name.equalsIgnoreCase(team[i].name_team)) no=i;
        if (no!=-1){
            System.out.println("���� ����� � � ������."
                    +"\t"+team[no].name_team+"\t"+team[no].city +"\t"+team[no].place_in_league+"\t"+team[no].number_of_wins);
        }
        else System.out.println("���� ������� ���� � ������");
    }
}

