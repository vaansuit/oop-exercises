public class DateP {
    private int day;
    private int month;
    private int year;
    private final String[] months = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    public DateP(int day, int month, int year) {
        if (day > 0 && day <= 31 && month > 0 && month <= 12 && year > 0) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            this.day = 1;
            this.month = 1;
            this.year = 1;
        }
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String[] getMonths() {
        return months;
    }

    public int compare(DateP anotherDate) {
        if (this.year == anotherDate.year && this.month == anotherDate.month && this.day == anotherDate.day) {
            return 0;
        } else if (this.year > anotherDate.year || (this.year == anotherDate.year && this.month > anotherDate.month) || (this.year == anotherDate.year && this.month == anotherDate.month && this.day > anotherDate.day)) {
            return 1;
        } else {
            return -1;
        }
    }

    public boolean isLeapYear() {
        if (this.year % 4 == 0) {
            if (this.year % 100 == 0) {
                return this.year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    // Clone
    public DateP clone() {
        return new DateP(this.day, this.month, this.year);
    }

}
