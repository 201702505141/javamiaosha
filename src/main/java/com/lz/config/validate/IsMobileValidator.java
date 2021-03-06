package com.lz.config.validate;

import com.lz.utils.ValidatorUtil;
import org.thymeleaf.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author m
 * @className IsMobileValidator
 * @description IsMobileValidator
 * @date 2020/5/15
 */
public class IsMobileValidator implements ConstraintValidator<IsMobile, String> {

    private boolean require = false;

    @Override
    public void initialize(IsMobile constraintAnnotation) {
        constraintAnnotation.required();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (require){
            return ValidatorUtil.isMobile(value);
        }else{
            if (StringUtils.isEmpty(value)){
                return true;
            }else{
                return ValidatorUtil.isMobile(value);
            }
        }
    }

}
