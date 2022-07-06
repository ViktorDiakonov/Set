import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("In my family live: Dad, Mom, Aunt and I");
        Family dad = new Family(36, "Male");
        Family mom = new Family(36, "Female");
        Family iAm = new Family(9, "Female");
        Family aunt = new Family(30, "Female");
        System.out.println("-----------------------------------------");

        System.out.println("These are the hash codes of our family, they are special for all people." + "\n" +
                "Dad's hash code: " + dad.hashCode() + "\n" +
                "Mom's hash code: " + mom.hashCode() + "\n" +
                "Daughter hash code: " + iAm.hashCode() + "\n" +
                "Aunt Hash Code: " + aunt.hashCode() + "\n" +
                "-----------------------------------------");

        System.out.println("Everyone in my family is different, but there are similarities" + "\n" +
                "Mom and Dad are the same gender?: " + dad.equalsToGender(mom) + "\n" +
                "Mom and Dad are the same age?: " + dad.equalsToAge(mom) + "\n" +
                "Mom and Aunt are the same age?: " + mom.equalsToAge(aunt) + "\n" +
                "-----------------------------------------");

        Set<Family> family = new HashSet<>();
        family.add(dad);
        family.add(mom);
        family.add(iAm);
        family.add(aunt);
        System.out.println("The house where our family lives is called a Set." + "\n" +
                "Now our family size is: " + family.size() + " peoples." + "\n" +
                "-----------------------------------------");

        family.remove(aunt);
        System.out.println("My mother said that my aunt was afraid of the war and went to Poland." + "\n" +
                "I did not believe my mother and called my aunt, in response I received: " +
                family.contains(aunt) + "\n" +
                "Now the size of our family: " + family.size() + " peoples." + "\n" +
                "-----------------------------------------");

        family.add(new Family(0, null));
        System.out.println("Dad said that mom is pregnant and I will have a brother or sister, " + "\n" +
                "but the baby has not been born yet, he is 0 years old and the gender is not known." + "\n" +
                "In our \"The Set - house\" everyone is where they want, look here: " + "\n" +
                family + "\n" + "The size of our future family: " + family.size() + " peoples." + "\n" +
                "-----------------------------------------");

        family.clear();
        System.out.println("Dad and Mom said that we need to leave our house." + "\n" +
                "We left and now our house is empty: " + family + "\n" +
                "Just in case, I checked if everyone left, the answer is: " + family.isEmpty());
    }
}
