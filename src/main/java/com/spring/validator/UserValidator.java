package com.spring.validator;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.spring.entity.User;


public class UserValidator implements Validator {
    public boolean supports(Class<?> clazz) {
        //判断当传入的参数类型为User类型是，进行校验
        return User.class.equals(clazz);
    }
    //验证数据
    public void validate(Object obj, Errors erros) {
        // 进行非空校验
        ValidationUtils.rejectIfEmpty(erros, "username", null,"用户名不能为空");
        ValidationUtils.rejectIfEmpty(erros, "password", null,"密码不能为空");
        User user= (User) obj;
        if (user.getUsername().length()>0){
            if (user.getUsername().length()<4 || user.getUsername().length()>20) {
                erros.rejectValue("username","length","用户名长度应为4-20个字符");
            }
        }
       if (user.getPassword().length()>0){
           if (user.getPassword().length()<6 || user.getPassword().length()>20) {
               erros.rejectValue("password", "size","密码长度应为6-20个字符");
           }
       }

    }
}
