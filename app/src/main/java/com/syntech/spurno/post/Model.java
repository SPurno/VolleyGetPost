package com.syntech.spurno.post;
/*
* Copyright (c) 2018 Faruk Ahmed
* License Under MIT
* Not use for commercial perpose
*    Permission is hereby granted, free of charge, to any person obtaining a copy
*    of this software and associated documentation files (the "Software"), to deal
*    in the Software without restriction, including without limitation the rights
*    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*    copies of the Software, and to permit persons to whom the Software is
*    furnished to do so, subject to the following conditions:
*/
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
