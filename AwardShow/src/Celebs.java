public class Celebs {
    enum Industry {
        Actor, Comedian, Model, Singer
    }

    //instance variables
    private char gender;        // 'F' or 'M'
    private String firstName, lastname;
    private int dayBirth, monthBirth, yearBirth;
    private Industry industry;
    private boolean isWinAward;

    // default constructors
    public Celebs(){
        setFirstName("N/A");
        setLastname("N/A");
    }

    // non-default constructors
    public Celebs(Industry initIndustry, String initFirstName, String initLastName, char initGender, boolean initIsWinAward){
        setIndustry(initIndustry);
        setFirstName(initFirstName);
        setLastname(initLastName);
        setGender(initGender);
        setWinAward(initIsWinAward);
        ;

    }
    // getters
    public char getGender(){
        return gender;
    }
    public String getFullName(){
        return this.firstName + " " + this.lastname;
    }
    public String getBirthInfo(){
        return this.dayBirth + "/" + this.monthBirth + "/" + this.yearBirth;
    }
    public Industry getIndustry(){
        return industry;
    }
    public boolean getIsWinAward() {
        return isWinAward;
    }

    // setters
    public boolean setGender(char newGender) {
        boolean retVal = false;
        if(newGender == 'M'|| newGender == 'm'|| newGender == 'F' || newGender == 'f') {
            gender =  newGender;
            retVal = true;
        }
        else{
            System.out.println("N/A");
        }
        return retVal;
    }
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    public void setLastname(String newLastName){
        lastname = newLastName;
    }
    public void setBirthDate(int day, int month, int year) {
        dayBirth = day;
        monthBirth = month;
        yearBirth = year;
    }
    public boolean setIndustry(Industry newIndustry) {
        boolean retVal = false;
        if (newIndustry == Industry.Actor || newIndustry == Industry.Comedian || newIndustry == Industry.Model || newIndustry == Industry.Singer) {
            industry = newIndustry;
            retVal = true;
        }
        return retVal;
    }
    public void setWinAward(Boolean newWinAward){
        isWinAward = newWinAward;
    }

    public String toString(){
        String retVal = "";
        retVal += "Name: " + getFullName() ;
        retVal += "\nGender: " + getGender();
        retVal += "\nDate Of Birth: " + getBirthInfo();
        retVal += "\nIndustry: " + getIndustry();
        retVal += "\nWinner: " + getIsWinAward() + "\n";
        return retVal;
    }
}
