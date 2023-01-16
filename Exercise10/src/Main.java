import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player player = new Player("Victor", "A", LocalDate.of(2020, 1, 8), "Brazilian", 1.81, 120);

        player.playerData();
        System.out.println(player.calculateAge());
        System.out.println(player.retirement());


    }
}