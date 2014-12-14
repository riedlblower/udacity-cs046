public class CountryNames
{
    /**
     * Gets the name with the proper article
     * @param name the country name
     * @return the name prepended with the proper article
     */
    public String getCompleteName(String name)
    {
        String completeName;
        String firstLetter;
        firstLetter = name.substring(0,1);

        if (name.endsWith("s")){
            completeName = "les " + name;
        }
        else if ("aeiouAEIOU".contains(firstLetter)){
            completeName = "l'" + name; 
            }
        else if (name.equals("Belize") || name.equals("Cambodge") || name.equals("Mexique") || name.equals("Mozambique") || name.equals("Zaire") || name.equals("Zimbabwe")){
            completeName = "le " + name;
        }
        else if (name.endsWith("e")){
            completeName = "la " + name;
        }
        else{
            completeName = "le " + name;
        }
        return completeName;
    }

}
