public class Month
{
    //instance variables
    private int theMonthNumber;
    /**
     * Contructs a Month
     * @param the month number. Must be 1 to 12. For any other number, the month number is set to 1
     */
    public Month(int theMonthNumber)
    {
        if (theMonthNumber < 1 || theMonthNumber > 12){
            this.theMonthNumber = 1;
        }
        else {
            this.theMonthNumber = theMonthNumber;
        }
    }

    /**
     * Gets the name of this month
     * @return the name of this month
     */
    public String getMonthName()
    {
        String monthName = "";
        if (theMonthNumber == 1){
            monthName = "January";
        }
        else if (theMonthNumber == 2){
            monthName = "February";
        }
        else if (theMonthNumber == 3){
            monthName = "March";
        }
        else if (theMonthNumber == 4){
            monthName = "April";
        }
        else if (theMonthNumber == 5){
            monthName = "May";
        }
        else if (theMonthNumber == 6){
            monthName = "June";
        }
        else if (theMonthNumber == 7){
            monthName = "July";
        }
        else if (theMonthNumber == 8){
            monthName = "August";
        }
        else if (theMonthNumber == 9){
            monthName = "September";
        }
        else if (theMonthNumber == 10){
            monthName = "October";
        }
        else if (theMonthNumber == 11){
            monthName = "November";
        }
        else if (this.theMonthNumber == 12){
            monthName = "December";
        }
        return monthName;
    }

    /**
     * Gets the number of days in this month
     * @return the number of days in this month in a non-leap year
     */
    public int getNumberOfDays()
    {
        int days=0;
        if (theMonthNumber == 4 || theMonthNumber == 9 || theMonthNumber == 11 || theMonthNumber == 6){
            days = 30;
        }
        else if (theMonthNumber == 2){
            days = 28;
        }
        else {
            days = 31;
        }
        return days;
    }
}
