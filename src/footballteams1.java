import java.util.Scanner;
class Teams {
    String name_team,city;
    double place_in_league,number_of_wins;
}public class footballteams1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("Введіть кількість футбольних команд =>");
        int n=sc.nextInt();
        Teams[]team=new Teams[n];
        System.out.println("Введіть інформацію про футбольну команду: ");
        for(int i = 0; i< team.length; i++) {
            sc.nextLine(); // очищення буфера
            team [i] = new Teams ();
            System.out.print("Назва "+(i+1)+"-комади =>");
            team[i].name_team=sc.nextLine();
            System.out.print("Місто "+(i+1)+"-команди =>");
            team[i].city=sc.nextLine();
            System.out.print("Місце в лізі "+(i+1)+"-команди =>");
            team[i].place_in_league=sc.nextDouble();
            System.out.print("Кількість перемог "+(i+1)+"-команди =>");
            team[i].number_of_wins=sc.nextDouble();
        }

        // Виведення отриманої інформації
        System.out.println("\nПовна інформація:");
        for (Teams str: team)
            System.out.println(""+str.name_team+"\t"+str.city +"\t"+str.place_in_league+"\t"+str.number_of_wins);

        // Команда з найбільшою кількістю перемог
        int winmax=0;
        double max=team[winmax].number_of_wins;
        for (int i = 0; i< team.length; i++) if (team[i].number_of_wins>max) {
            max = team [i].number_of_wins;
            winmax=i;
        }
        System.out.println("\nКоманда з найбільшою кількістю перемог :");
        System.out.println(""+team[winmax].name_team+"\t"+team[winmax].number_of_wins);
        // Команда з кількістю перемог більше середнього
        double s=0;
        for (int i = 0; i<team.length; i++)
            s+=team[i].number_of_wins;
        double sr=s/team.length; ;
        System.out.println("Середня кількість перемог ="+sr);
        System.out.println("\nКоманда з кількістю перемог більше середнього");
        for (int i = 0; i < team.length; i++) {
            if (team[i].number_of_wins>sr)
                System.out.println(team[i].name_team +"\t"+team[i].number_of_wins );
        }

        // Упорядкувати масив зі спаданням місць у лізі
        for (int i = 0; i >team.length-1; i++)
            for (int j = 0; j >team.length-1-i; j++)
                if (team[j].place_in_league<team[j+1].place_in_league){
                    Teams rab=team[j];
                    team[j]=team[j+1];
                    team[j+1]=rab;
                }
        System.out.println("порядкувати масив зі спаданням місць у лізі");
        for (Teams value : team) {
            System.out.println(""+value.name_team+"\t"+value.place_in_league);}

        // Пошук команди за назвою
        sc.nextLine();
        System.out.println("Введіть назву шуканої команди=>");
        String name=sc.nextLine();
        int no=-1;
        for (int i = 0; i < team.length; i++)
            if (name.equalsIgnoreCase(team[i].name_team)) no=i;
        if (no!=-1){
            System.out.println("Така країна є у списку."
                    +"\t"+team[no].name_team+"\t"+team[no].city +"\t"+team[no].place_in_league+"\t"+team[no].number_of_wins);
        }
        else System.out.println("Такої команди немає у списку");
    }
}

