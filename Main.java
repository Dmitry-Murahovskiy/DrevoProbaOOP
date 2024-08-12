import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamTree famTree = new FamTree();

        Human human1 = new Human(Gender.Male, " Дмитрий ",1992,0000);
        Human human2 = new Human(Gender.Female, " Екатерина ",1995,19);
        Human human3 = new Human(Gender.Female, " Александра ",2020,2);
        Human human4 = new Human(Gender.Female, " Марина ",1970,9);



        System.out.println(famTree);
    }
}