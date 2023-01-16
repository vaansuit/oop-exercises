public class Flight {

    private int flightNumber;
    private boolean[] sits;

    private int nextAvaliableSit;

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
        this.sits = new boolean[100];
        this.nextAvaliableSit = 0;
    }

    public int nextAvaliaboeSit() {
        for (int i = nextAvaliableSit; i < sits.length; i++) {
            if (!sits[i]) {
                nextAvaliableSit = i;
                return i;
            }
        }
        return  -1;
    }

    public boolean checkAvaliableSit(int sit) {
        return sits[sit];
    }

    public boolean occupySit(int sit) {
        if (!checkAvaliableSit(sit)) {
            sits[sit] = true;
            return true;
        }
        return false;
    }

    public int avaliableSits() {
        int count = 0;
        for (int i = 0; i < sits.length; i++) {
            if (sits[i]) {
                count++;
            }
        }

        return count;
    }

    public int getFlightNumber() {
        return flightNumber;
    }



}
