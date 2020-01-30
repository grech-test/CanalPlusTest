package dto;

import java.util.ArrayList;

public class Abonne {
    private String name;
    private String tel;
    ArrayList<Contrat> contrats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public ArrayList<Contrat> getContrats() {
        return contrats;
    }

    public void setContrats(ArrayList<Contrat> contrats) {
        this.contrats = contrats;
    }
}
