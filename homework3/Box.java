public class Box <T, U, V, X> {
    private T typeOfFruit;
    private U numberOfFruit;
    private V weightOfFruit;
    private X numberOfBox;

    public void setTypeOfFruit(T typeOfFruit) {
        this.typeOfFruit = typeOfFruit;
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
        return typeOfFruit;
    }
    public U getNumberOfFruit() {
        return numberOfFruit;
    }
    public V getWeightOfFruit() {
        return weightOfFruit;
    }

    Box(T typeOfFruit, U numberOfFruit, V weightOfFruit, X numberOfBox){
        this.typeOfFruit = typeOfFruit;
        this.numberOfFruit = numberOfFruit;
        this.weightOfFruit = weightOfFruit;
        this.numberOfBox = numberOfBox;
    }
//метод сравнения веса коробок


    public double compare(Box compareBox) {
        return ((int)this.numberOfFruit*(double)this.weightOfFruit) - (int)compareBox.getNumberOfFruit()*(double)compareBox.getWeightOfFruit();

    }


}
