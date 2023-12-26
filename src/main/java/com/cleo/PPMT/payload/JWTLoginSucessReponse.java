package com.cleo.PPMT.payload;

import lombok.Getter;

import java.util.Date;

@Getter
public class JWTLoginSucessReponse {
    private boolean success;
    private String token;
    private final Date date;
    private Object userName;

    public JWTLoginSucessReponse(boolean success, String token,Object userName) {
        this.success = success;
        this.token = token;
        this.date=new Date(System.currentTimeMillis());
        this.userName=userName;
        System.out.println("Hello:"+userName);
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "JWTLoginSucessReponse{" +
                "success=" + success +
                ", token='" + token + '\'' +
                '}';
    }
}
