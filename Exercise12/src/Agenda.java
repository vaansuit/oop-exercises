public class Agenda {
    private People[] people;
    private int peopleNum;

    public Agenda() {
        people = new People[10];
        peopleNum = 0;
    }

    public void addPeople(String name, int age, double height) {
        if(peopleNum < 10) {
            people[peopleNum] = new People(name, age, height);
            System.out.println("Success!");
            peopleNum++;
        } else {
            System.out.println("The agenda is already full!");
        }
    }
    public int searchPeople(String name) {
        for (int i = 0; i < peopleNum; i++) {
            if (people[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void removePeople(String name) {
        int search = searchPeople(name);

        if (search != -1) {
            for (int i = search; i < peopleNum - 1 ; i++) {
                people[i] = people[i + 1];
            }
            peopleNum--;
        } else {
            System.out.println("People doesn't exist.");
        }
    }

    void showAgenda() {
        for (int i = 0; i < peopleNum; i++) {
            System.out.println(people[i].toString());
        }
    }

    public void showPeople(int index) {
        if (index >= 0 && index < peopleNum) {
            System.out.println(people[index].toString());
        } else {
            System.out.println("Invalid position.");
        }
    }



}
