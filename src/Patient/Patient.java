package Patient;

import java.util.Date;
import java.util.Random;

public class Patient extends Owner{
    private int clinicalId;
    private String name;
    private String breed;
    private Owner owner;
    private boolean isVaccinated;
    private Date deWormingDate;


    public Patient(String dni, String name, String surname, String cellphone, int age, int clinicalId, String name1, String breed, Owner owner, boolean isVaccinated, Date deWormingDate) {
        super(dni, name, surname, cellphone, age);
        this.clinicalId = clinicalId;
        this.name = name1;
        this.breed = breed;
        this.owner = owner;
        this.isVaccinated = isVaccinated;
        this.deWormingDate = deWormingDate;
    }

    public int getClinicalId() {
        return clinicalId;
    }

    public void setClinicalId(int clinicalId) {
        int random = ((int)(Math.random()*9000)+1000);
        random = clinicalId;
        this.clinicalId = clinicalId;
    }
}
