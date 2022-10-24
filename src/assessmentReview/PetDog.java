package assessmentReview;

public class PetDog extends Pet implements Companion {
    private Boolean trained;

    public Boolean getTrained() {
        return trained;
    }

    public void setTrained(Boolean trained) {
        this.trained = trained;
    }

    public PetDog() {}

    public PetDog(String name, String type, Boolean trained) {
        super(name, type);
        this.trained = trained;
    }

    public Boolean isTrained() {
        return trained;
    }

    @Override
    public String snuggle() {
        return name + " wants to snuggle.";
    }
}
