import java.util.ArrayList;
import java.util.List;

public class FamTree {
    private  List<Human> humans;
    private Human human;
    private String name;

    public FamTree(){
        humans = new ArrayList<>();
    }

    public int size(){
        return humans.size();

    }

    public void addHuman() {
        addHuman(null);
    }

    public void addHuman(Human human) {
        this.human = human;
        humans.add(human);
    }

    public Human getByName() {
        return getByName(null);
    }

    public Human getByName(String name)
    {
        this.name = name;
        for (Human human : humans) {
            return human;
        }
        return  null;

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" Колличесто человек \n " );
        for (Human human : humans) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
