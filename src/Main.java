import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("В моей семье живут: Папа, Мама, Тетя и Я");
        Family dad = new Family(36, "Male");
        Family mom = new Family(36, "Female");
        Family iAm = new Family(9, "Female");
        Family aunt = new Family(30, "Female");
        System.out.println("-----------------------------------------");

        System.out.println("Это хеш-коды нашей семьи, они особенные как все люди");
        System.out.println("Хэш-код папы: " + dad.hashCode());
        System.out.println("Хэш-код мамы: " + mom.hashCode());
        System.out.println("Хэш-код дочки: " + iAm.hashCode());
        System.out.println("Хэш-код тети: " + aunt.hashCode());
        System.out.println("-----------------------------------------");

        System.out.println("В моей семье все разные, но есть и сходства");
        System.out.println("Папа и мама одинаковые по полу?: " + dad.equalsToGender(mom));
        System.out.println("Папа и мама одинаковые по возрасту?: " + dad.equalsToAge(mom));
        System.out.println("Мама и тетя одинаковые по возрасту?: " + mom.equalsToAge(aunt));
        System.out.println("-----------------------------------------");

        Set<Family> family = new HashSet<>();
        family.add(dad);
        family.add(mom);
        family.add(iAm);
        family.add(aunt);
        System.out.println("Дом, в котором живет наша семья, называется Set" + "\n" +
                "Сейчас размер нашей семьи: " + family.size() + " человека.");
        System.out.println("-----------------------------------------");

        System.out.println("Моя мама сказала, что тетя испугалась войны и уехала в Польшу");
        family.remove(aunt);
        System.out.println("Я не поверила маме и позвала тетю, в ответ получила: " + family.contains(aunt) + "\n" +
                "Теперь размер нашей семьи: " + family.size() + " человека.");
        System.out.println("-----------------------------------------");

        family.add(new Family(0, null));
        System.out.println("Папа сказал, что мама беременна и у меня будет братик или сестричка, " + "\n" +
                "но ребенок еще не родился, ему 0 годиков и пол не известен." + "\n" +
                "В нашем Set - доме все находятся где хотят, вот сами посмотрите: " + "\n" +
                family + "\n" + "Размер нашей будущей семьи: " + family.size() + " человека.");
        System.out.println("-----------------------------------------");

        family.clear();
        System.out.println("Папа и Мама сказали, что нам нужно уехать из нашего дома." + "\n" +
                "Мы уехали и теперь наш домик пустой: " + family);
        System.out.println("На всякий случай, я проверила, все ли вещи мы забрали с собой, ответ: " +
        family.isEmpty());

    }
}
