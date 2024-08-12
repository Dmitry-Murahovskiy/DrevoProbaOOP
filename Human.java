import java.time.LocalDate;
import java.util.List;

public class Human {
    List<Human> parents;
    List<Human> childrens;
    private long id;
    private String name;
    private Gender gender;
    private int i = 0;
    private final int i1;
    private LocalDate birthDate;
    public LocalDate deathDate;

    public Human(Gender gender, String name, int birthDate, int deathDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = LocalDate.now();
        this.deathDate = LocalDate.now();
        i1 = 0;
    }

    public Human(String name, Gender gender, int i, int i1) {
        this.name = name;
        this.gender = gender;
        this.i = i;
        this.i1 = i1;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    @Override
    public String toString() {
        return "Имя персонажа" + name + "Пол" + gender + ", Дата рождения" + birthDate ;
    }

}
