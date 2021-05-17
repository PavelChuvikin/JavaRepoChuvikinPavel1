public class Robot {
    private String name;
    private int maxRunDistance;
    private int maxJump;
    Robot(String name, int maxRunDistance, int maxJump){
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJump = maxJump;
    }
    // Геттеры, сеттеры
    public int getMaxRunDistance (){
        return maxRunDistance;
    }
    public void setMaxRunDistance (int maxRunDistance){
        this.maxRunDistance = maxRunDistance;
    }

    public int getMaxJump (){
        return maxJump;
    }
    public void setMaxJump (int maxJump){
        this.maxJump = maxJump;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }
    // Методы бега и прыжка
    void robotRun (){
        System.out.println(this.name + " пробежал");
    }

    void robotJump () {
        System.out.println(this.name + " прыгнул");
    }


}