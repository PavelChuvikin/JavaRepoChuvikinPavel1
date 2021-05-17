public class Cat {
    private String name;
    private int maxRunDistance;
    private int maxJump;
    Cat(String name, int maxRunDistance, int maxJump){
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
    public String getName (){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    // Методы бега и прыжка
    void catRun (){
        System.out.println(this.name + " пробежал");
    }

    void catJump () {
        System.out.println(this.name + " прыгнул");
    }


}
