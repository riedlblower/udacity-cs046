==========================================
    /**
     * Determine if the parameter is greater than or equal to 0 and less than or equal to 100
     * @param value the value to test
     * @return true if value is greater than or equal to 0 and less than or equal to 100
     * Otherwise return false
     */   
     public boolean inRange(int value)
    {
        if ((value>=0) && (value<=100)){
            return true;
        }
        else {
            return false;
        }
    }
}
==========================================
    /**
     * Determine if the string comes after "Udacity" in lexicographic order
     * @param string1 the first string
     * @return true if string1 comes after "Udacity' in lexicographic order.
     * Otherwise return false
     */
    public boolean comesAfter(String string1)
    {
        if (string1.compareTo("Udacity") > 0){
            return true;
        }
        else {
            return false;
        }
    }
==========================================
   /**
    * Determines if the instructor given is the instructor in this course, Cay Horstmann
    * @param instructor the name to check
    * @return true if the instructor is Cay Horstmann. False otherwise
    */
   public boolean isMyInstructor(String instructor)
   {
       //fullName contains Cay Horstmann
       String fullName = firstName + " " + lastName;
       // your code goes here
        if (instructor.compareTo(fullName) == 0){
            return true;
        }
        else {
            return false;
        }
   }
==========================================
   
