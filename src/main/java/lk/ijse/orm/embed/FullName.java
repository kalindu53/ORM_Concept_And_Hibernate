package lk.ijse.orm.embed;

import jakarta.persistence.Embeddable;

@Embeddable
public class FullName {
    private String firstname;
    private String lastname;

    public FullName(String firstname, String lastname) {

        this.firstname = firstname;
        this.lastname = lastname;
    }

    public FullName() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
