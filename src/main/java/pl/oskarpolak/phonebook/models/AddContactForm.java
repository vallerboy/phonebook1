package pl.oskarpolak.phonebook.models;

public class AddContactForm {
    private String name;
    private String surname;
    private String phone;
    private String email;

    public AddContactForm(String name, String surname, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }

    public AddContactForm() { }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
