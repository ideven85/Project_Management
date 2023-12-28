package com.cleo.PPMT.validator;

import com.cleo.PPMT.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.util.StringUtils;

@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {

        User user = (User) object;

        if(user.getPassword().length() <8){//1
            errors.rejectValue("password","Length", "Password must be at least 8 characters");
        }else{
            String p = user.getPassword();
            if(p.matches("[0-9]")||p.toLowerCase().matches("[a-z]")){
                errors.rejectValue("password", "AlphaNumeric","Password Should be alpha Numeric");
            }
        }

        if(!user.getPassword().equals(user.getConfirmPassword())){
            errors.rejectValue("confirmPassword","Match", "Passwords must match");

        }

        //confirmPassword
        //todo 


    }
}
