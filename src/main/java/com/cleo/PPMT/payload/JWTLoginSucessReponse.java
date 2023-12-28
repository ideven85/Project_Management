package com.cleo.PPMT.payload;

//import lombok.Getter;

import java.util.Date;

//import io.jsonwebtoken.lang.Arrays;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class JWTLoginSucessReponse {
    private boolean success;
    private String token;
    private final Date date;
    private String username;
    private String password;

    public JWTLoginSucessReponse(boolean success, String token,String username,String password) {
        this.success = success;
        this.token = token;
        this.date=new Date(System.currentTimeMillis());
       this.username=username;
       this.password=password;
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
