package dto;

public class Contrat {
    private String numContract;
    private String typeContact;
    Adresse adresse;

    public Contrat(String numContract, String typeContact, Adresse adresse) {
        this.numContract = numContract;
        this.typeContact = typeContact;
        this.adresse = adresse;
    }

    public String getNumContract() {
        return numContract;
    }

    public void setNumContract(String numContract) {
        this.numContract = numContract;
    }

    public String getTypeContact() {
        return typeContact;
    }

    public void setTypeContact(String typeContact) {
        this.typeContact = typeContact;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
