package EmailHolder.entity;

import java.util.List;

public class Email {

    String email;
    String password;
    List<String> listOfSitesUsed;
    String description;

    public Email() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getListOfSitesUsed() {
        return listOfSitesUsed;
    }

    public void setListOfSitesUsed(List<String> listOfSitesUsed) {
        this.listOfSitesUsed = listOfSitesUsed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
