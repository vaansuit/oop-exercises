public class Elevator {
    private int currentFloor = 0;
    private int numberOfFloors;
    private int capacityOfPeople;
    private int currentAmountOfPeople = 0;


    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    public int getNumberOfFloors() {
        return  this.numberOfFloors;
    }

    public void setCapacityOfPeople(int capacityOfPeople) {
        this.capacityOfPeople = capacityOfPeople;
    }

    public int getCapacityOfPeople() {
        return this.capacityOfPeople;
    }

    public void startElevator(int numberOfFloors, int capacityOfPeople) {
        System.out.println("The number of floors of this building is " + numberOfFloors + " and the capacity of people is " + capacityOfPeople);
    }

    public void enterElevator(int enterPeople) {
        int newAmountOfPeople = enterPeople + this.currentAmountOfPeople;

        if (newAmountOfPeople < capacityOfPeople) {
            System.out.println("The elevator is within its maximum capacity.");
        } else {
            System.out.println("The elevator is out of its maximum capacity.");
        }
    }

    public void outElevator(int outPeople) {
        int newAmountOfPeople = outPeople - this.currentAmountOfPeople;
        if (outPeople < 0) {
            System.out.println("There's no one in the elevator.");
        } else {
            System.out.println("Someone is out of the elevator.");
        }
    }

    public void elevatorUp(int floorSelected) {
        if (floorSelected > numberOfFloors) {
            System.out.println("You're already in the final floor. There's no floor " + floorSelected);
        } else {
            System.out.println("You're going to the " + floorSelected + " floor.");
        }
    }

    public void elevatorDown(int floorSelected) {
        if (floorSelected < numberOfFloors) {
            System.out.println("You're already in the ground floor.");
        } else {
            System.out.println("You're going to the " + floorSelected + " floor.");
        }
    }



}
