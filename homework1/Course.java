public class Course {
     private  int distance;
     private  int height;
    Course(int distance, int height){  // выстоа для беговой дорожки и длина для стены будут равны нулю
        this.distance = distance;
        this.height = height;
    }
    // Геттеры, сеттеры
    public void setDistance (int distance){
        this.distance = distance;
    }
    public void setHeight (int height){
        this.height = height;
    }

    public int getDistance (){
        return distance;
    }
    public int getHeight (){
        return height;
    }
}

