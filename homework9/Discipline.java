public class Discipline implements Course{

    public String getName() {
        return name;
    }

    private String name;
    Discipline(String name){
        this.name=name;
    }


    @Override
    public String toString() {
        return name;
    }
}
