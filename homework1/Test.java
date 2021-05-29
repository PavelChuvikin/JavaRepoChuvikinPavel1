public class Test {

    public static void main(String[] args){

        //Создаем человека, робота, кота
        Human Ivan = new Human("Ivan", 200, 3);
        Robot Robot1 = new Robot("Robot1", 500, 20);
        Cat Vasya = new Cat("Vasya", 150, 10);
        //Создаем членов команды (человек, робот, кот)
        TeamMember TeamMember1 = new TeamMember(Ivan.getName(), Ivan.getMaxRunDistance(), Ivan.getMaxJump());
        TeamMember TeamMember2 = new TeamMember(Robot1.getName(), Robot1.getMaxRunDistance(), Robot1.getMaxJump());
        TeamMember TeamMember3 = new TeamMember(Vasya.getName(), Vasya.getMaxRunDistance(), Vasya.getMaxJump());
        //Создаем препятствия
        Course Treadmill1 = new Course(200, 0);
        Course Treadmill2 = new Course(150, 0);
        Course Wall1 = new Course(0,5);
        Course Wall2 = new Course(0,7);
        //Объединяем препятствия в массив
        Course[] obstacleСourse = {Treadmill1, Treadmill2, Wall1, Wall2};
        //Объединяем членов команды в массив
        TeamMember[] team = {TeamMember1, TeamMember2, TeamMember3} ;
        //запускаем метод прохождения полосы препятствий
        teamRun(team, obstacleСourse);

    }
    //метод прохождения полосы препятствий
    public static void teamRun (TeamMember[] team, Course[] obstacleСourse){
        boolean result = true;
        for(int i=0; i<team.length; i++){
            for(int j=0; j<obstacleСourse.length; j++){
            if ((team[i].getMaxRunDistance() <= obstacleСourse[j].getDistance()) || (team[i].getMaxJump() <= obstacleСourse[j].getHeight())) {
                System.out.println(team[i].getName() + " не прошел полосу препятствий ");
                result = false;
                break;
            }
           else{
                result = true;
               }
           }
            if (result){
                System.out.println(team[i].getName() + " прошел полосу препятствий");
            }
        }
    }
}
