package br.com.klb.testeklb.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class ResourceNotAllowException extends RuntimeException {

    public ResourceNotAllowException(String message) {
        super(message);
    }

}
