package Patient;

public class Owner {
    private String dni; // 10 Digits
    private String name;
    private String surname;
    private String cellphone; // 10 digits
    private int age;

    public Owner(String dni, String name, String surname, String cellphone, int age) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.cellphone = cellphone;
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if(dni.length() == 10){
            this.dni = dni;
        }else{
            System.out.println("DNI must be 10 digits long");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        if(cellphone.length() == 10)
        {
            this.cellphone = cellphone;
        }else{
            System.out.println("Cellphone number must be 10 digits");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18){
            this.age = age;
        }else{
            System.out.println("Age must be at least 18 years old");
        }
    }
}
