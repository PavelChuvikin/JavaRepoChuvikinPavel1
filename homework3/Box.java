public class Box <T, U, V, X> {
    private T nameOfFruit;
    private U numberOfFruit;
    private V weightOfFruit;
    private X numberOfBox;

    public void setNameOfFruit(T nameOfFruit) {
        this.nameOfFruit = nameOfFruit;
    }
    public void setNumberOfFruit(U numberOfFruit) {
        this.numberOfFruit = numberOfFruit;
    }
    public void setWeightOfFruit(V weightOfFruit) {
        this.weightOfFruit = weightOfFruit;
    }
    public void setNumberOfBox(X nameOfBox) {
        this.numberOfBox = nameOfBox;
    }
    public X getNumberOfBox() {
        return numberOfBox;
    }

    public T getNameOfFruit() {
        return nameOfFruit;
    }
    public U getNumberOfFruit() {
        return numberOfFruit;
    }
    public V getWeightOfFruit() {
        return weightOfFruit;
    }

    Box(T nameOfFruit, U numberOfFruit, V weightOfFruit, X numberOfBox){
        this.nameOfFruit = nameOfFruit;
        this.numberOfFruit = numberOfFruit;
        this.weightOfFruit = weightOfFruit;
        this.numberOfBox = numberOfBox;
    }
//метод сравнения веса коробок
    public boolean compare(Box compareBox){
        return ((int)compareBox.getNumberOfFruit()*(double)compareBox.getWeightOfFruit() == ((int)this.numberOfFruit*(double)this.weightOfFruit));

    }

}
