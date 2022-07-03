public class Date {
    private int day;
    private int month;
    private int year;

    // constructor
    public Date(int initDay, int initMonth, int initYear){
        if(validateDate(initDay, initMonth, initYear)){
            day = initDay;
            month = initMonth;
            year = initYear;
        }
    }

    // methods
    public String toString(){
        String retVal;

        retVal = day + "/" + month + "/" + year;
        return retVal;
    }

    public boolean validateDate(int rawDay, int rawMonth, int rawYear) {
        boolean retVal = false;
        switch (rawMonth) {
            // Jan (1), Mar (3), May(5), Jul(7), Aug(8), Oct(10), Dec(12) = 31 days
            case 1, 3, 5, 7, 8, 10, 12:
                if (rawDay > 0 && rawDay <= 31){
                    retVal = true;
                }
                break;

            // Apr(4), Jun(6), Sep(9), Nov(11) = 30 days
            case 4, 6, 9, 11:
                if(rawDay > 0 && rawDay <= 30){
                    retVal = true;
                }
                break;

            // Feb (2) = 28 or 29 days depending on leap year
            case 2:
                if(rawDay > 0 && rawDay <= 29){
                    retVal = true;
                }
                break;
            default:
                System.out.println("Error");
        }
        return retVal;
    }
    public static void main(String[] args) {
        Date newDate = new Date(3, 7, 2022);
        System.out.println(newDate.toString());
    }
}
