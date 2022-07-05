import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Family dad = new Family(36, "Male");
        Family mom = new Family(36, "Female");
        Family daughter = new Family(9,"Female");
        Family aunt = new Family(30,"Female");

        System.out.println("Хэш-код папы: " + dad.hashCode());
        System.out.println("Хэш-код мамы: " + mom.hashCode());
        System.out.println("Хэш-код дочки: " + daughter.hashCode());
        System.out.println("Хэш-код тети: " + aunt.hashCode());

        System.out.println("Папа и мама одинаковые по полу?: " + dad.equalsToGender(mom));
        System.out.println("Папа и мама одинаковые по возрасту?: " + dad.equalsToAge(mom));
        System.out.println("Мама и тетя одинаковые по возрасту?: " + mom.equalsToAge(aunt));

        Set<Family> family = new HashSet<>();
        family.add(dad);
        family.add(mom);
        family.add(daughter);
        family.add(aunt);
        // мама забеременела, в семье будет пополнение, у ребенка еще нет возраста и пол не известен
        family.add(new Family(0,null));
        System.out.println("Размер будущей семьи: " + family.size() + " человек.");

    }
}
