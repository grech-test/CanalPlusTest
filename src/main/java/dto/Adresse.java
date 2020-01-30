package dto;

public class Adresse {
    private String active;
    private String condition;
    private String pays;

    public Adresse(String active, String condition, String pays) {
        this.active = active;
        this.condition = condition;
        this.pays = pays;
    }

    public String getActive() {
        return active;
    }

    public String getCondition() {
        return condition;
    }

    public String getPays() {
        return pays;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
