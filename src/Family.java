import java.util.Objects;

public class Family {
    public int age;
    public String gender;

    public Family(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    // Реализация метода hashCode. Если кратко, то "глубинные" реализации метода
    // были подняты на поверхность и немного изменены
    @Override
    public int hashCode() {
        int result = 1;
        final int CONST = 31;
        result = CONST * result + age;
        result = CONST * result + (gender == null ? 0 : gender.hashCode());
        return result;
    }

    // учитывая, что у меня в параметрах класса переменные и объект, я разделил метод equals
    // на два метода (для примитивов и объектов) и в main делал соответствующее сравнение
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return age == family.age && Objects.equals(gender, family.gender);
    }

    // реализация equals для примитивов
    public boolean equalsToAge(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return age == family.age;
    }

    // реализация equals для объектов
    public boolean equalsToGender(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(gender, family.gender);
    }

    @Override
    public String toString() {
        return "Family{" +
                "age='" + age + '\'' +
                ", gender=" + gender +
                '}';
    }
}
