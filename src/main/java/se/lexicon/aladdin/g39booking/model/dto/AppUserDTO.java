package se.lexicon.aladdin.g39booking.model.dto;

import se.lexicon.aladdin.g39booking.model.constants.UserRole;

import java.io.Serializable;
import java.util.List;

public class AppUserDTO implements Serializable {
    private String id;
    private String username;
    private List<UserRole> roles;

    public AppUserDTO(String id, String username, List<UserRole> roles) {
        this.id = id;
        this.username = username;
        this.roles = roles;
    }

    public AppUserDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRole> roles) {
        this.roles = roles;
    }
}
