public class Dog {
    private static int dogCount = 0;
    public static final int MAX_LIVES = 9;
    String name;
    int age;
    int livesRemaining;

    public void Bark(){
        System.out.println("Woof");
    }
    public Dog(){
        dogCount++;
        livesRemaining = MAX_LIVES;
    }
    public static int getCatCount(){
        return dogCount;
    }
}
