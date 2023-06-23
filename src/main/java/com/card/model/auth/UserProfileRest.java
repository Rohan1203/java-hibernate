package com.card.model.auth;

import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * @author rohan.das on 20/06/23
 * @project system-integration
 */

@XmlRootElement
public class UserProfileRest {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String href;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
