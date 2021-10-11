package com.User;

public class UserDto {
    private Long user_id;
    private String username;
    private String password;
    private String full_name;

    public UserDto(Long user_id, String username, String full_name) {
        this.user_id = user_id;
        this.username = username;
        this.full_name = full_name;
    }

    public String getUser_id() {
        return user_id.toString();
    }

    public long getUserIdAsLong() { return user_id; }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
