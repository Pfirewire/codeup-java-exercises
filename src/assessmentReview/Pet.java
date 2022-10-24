package assessmentReview;

public abstract class Pet implements Companion {
    protected String name;
    protected String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pet() {}

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
