package com.syntech.spurno.post;

public class Model {
    private String user__Name;
    private String pas_sword;

    public Model(String username, String password){
        this.user__Name = username;
        this.pas_sword = password;
    }

    public String getUser__Name() {
        return user__Name;
    }

    public void setUser__Name(String user__Name) {
        this.user__Name = user__Name;
    }

    public String getPas_sword() {
        return pas_sword;
    }

    public void setPas_sword(String pas_sword) {
        this.pas_sword = pas_sword;
    }

}
