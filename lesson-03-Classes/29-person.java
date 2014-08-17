// Bluej project: lesson3/friends4
public class Person
{
    private String name;
    private String friends;
    private int x;
    private int y;

    public Person (String aName, String pictureName, int xCoord, int yCoord)
    {
        name = aName;
        friends = "";
        x = xCoord;
        y = yCoord;
        Picture picture = new Picture(pictureName);
        picture.translate(xCoord, yCoord);
        picture.draw();
    }
    
    public void addFriend(Person friend) 
    {
        int endingXPosition; 
        int endingYPosition;

        endingXPosition = friend.x; 
        endingYPosition = friend.y;

        friends = friends + friend.name + " ";
        
        SmallCircle circle = new SmallCircle(x, y);
        circle.fill();

        Line friendsLine = new Line (x, y, endingXPosition, endingYPosition);
        friendsLine.draw();
    }
    
    public void unfriend(Person nonFriend)
    {
        friends = friends.replace(nonFriend.name + " ", "");
    }
    
    public String getFriends() 
    {
        return friends;
    }
}
