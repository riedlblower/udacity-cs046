public class PersonDemo
{
    public static void main(String[] args)
    {
        Person sara = new Person("Sara", "sara.jpg", 10, 200);
        Person chenghan = new Person("Cheng-Han", "cheng-han.png", 300, 0);
        Person cay = new Person("Cay", "cay.gif", 250, 180);
        
        sara.addFriend(cay);
        sara.addFriend(chenghan);
    }
}
