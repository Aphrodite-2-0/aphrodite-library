package com.brihaspathee.aphrodite.exception;

import com.networknt.schema.ValidationMessage;
import lombok.*;

import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 19, May 2022
 * Time: 7:50 AM
 * Project: aphrodite-library
 * Package Name: com.brihaspathee.aphrodite.exception
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AphroditeApiValidationException extends RuntimeException{

    private String apiName;

    private Set<ValidationMessage> validationMessages;

    public AphroditeApiValidationException(String message){
        super(message);
    }

    public AphroditeApiValidationException(String message, Throwable cause){
        super(message, cause);
    }

    public AphroditeApiValidationException(Set<ValidationMessage> validationMessages, String apiName){
        this.validationMessages = validationMessages;
        this.apiName = apiName;
    }
}
