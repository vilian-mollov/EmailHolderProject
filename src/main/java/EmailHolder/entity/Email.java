package EmailHolder.entity;

import java.util.ArrayList;
import java.util.List;

public class Email {

    String email;
    String password;
    String description;
    List<String> listOfSitesUsed;

    public Email() {
        listOfSitesUsed = new ArrayList<>();
        email = "";
        password = "";
        description = "";
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
        this.listOfSitesUsed.add("FaceBook");
        this.listOfSitesUsed.add("FaceBook");
        this.listOfSitesUsed.add("FaceBook");
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
