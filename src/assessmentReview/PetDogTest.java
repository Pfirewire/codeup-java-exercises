package assessmentReview;

import java.util.ArrayList;
import java.util.Arrays;

public class PetDogTest {

    public static void main(String[] args) {
        PetDog sammy = new PetDog("Sammy", "dog", true);
        System.out.println(sammy.snuggle());
        PetDog frankie = new PetDog("Frankie", "dog", false);
        PetDog penny = new PetDog("Penny", "dog", true);
        ArrayList<PetDog> dogs = new ArrayList<>(Arrays.asList(penny, frankie, sammy));
        System.out.println(PetDog.allSnuggle(dogs));
    }
}