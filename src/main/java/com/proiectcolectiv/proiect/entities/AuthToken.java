package com.proiectcolectiv.proiect.entities;

public class AuthToken {

    private String accessToken;
    private String tokenType = "Bearer";
    private String email;
    private Long id;
    private Role role;

    public AuthToken(String accessToken, String email, Long id, Role role) {
        this.accessToken = accessToken;
        this.id = id;
        this.email = email;
        this.role=role;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
