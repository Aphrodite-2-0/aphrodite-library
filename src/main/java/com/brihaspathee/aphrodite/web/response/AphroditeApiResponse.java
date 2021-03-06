package com.brihaspathee.aphrodite.web.response;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 19, May 2022
 * Time: 1:32 PM
 * Project: aphrodite-library
 * Package Name: com.brihaspathee.aphrodite.web.response
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AphroditeApiResponse<E> {

    /**
     * Time stamp when the response was generated
     */
    private LocalDateTime timestamp;

    private int statusCode;

    private HttpStatus status;

    private String reason;

    private String message;

    private String developerMessage;

    private E response;


    @Override
    public String toString() {
        return "ZeusApiResponse{" +
                "timestamp=" + timestamp +
                ", statusCode=" + statusCode +
                ", status=" + status +
                ", reason='" + reason + '\'' +
                ", message='" + message + '\'' +
                ", developerMessage='" + developerMessage + '\'' +
                ", response=" + response +
                '}';
    }
}
