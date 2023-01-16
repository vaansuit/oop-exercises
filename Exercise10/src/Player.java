import java.time.LocalDate;
import java.time.Period;
public class Player {

    private String playerName;
    private String playerPosition;

    private LocalDate dateOfBirth;
    private String nationality;
    private double height;
    private double weight;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Player(String playerName, String playerPosition, LocalDate dateOfBirth, String nationality, double height, double weight) {
        this.playerName = playerName;
        this.playerPosition = playerPosition;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
    }
    public void playerData() {
        System.out.println("Player name: " + playerName);
        System.out.println("Player position: " + playerPosition);
        System.out.println("Player date of birth: " + dateOfBirth);
        System.out.println("Player nationality: " + nationality);
        System.out.println("Player height: " + height);
        System.out.println("Player weight: " + weight);
    }

    public int calculateAge() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(dateOfBirth, today);
        return period.getYears();
    }

    public int retirement() {
        int retirementTime = 0;

        switch(playerPosition) {
            case "D":
               retirementTime = 40 -calculateAge();

               break;
            case "MC":
                retirementTime = 38 - calculateAge();

            case "A":
                retirementTime = 35 -calculateAge();
                break;
        }

        return retirementTime;

    }
}
