package org.example.internationalization;

import org.springframework.context.MessageSource;

import java.util.Locale;

public class NotFoundException extends RuntimeException {
    public NotFoundException(MessageSource messageSource, String entity, String field, Locale locale) {
        super(messageSource.getMessage("user.notfound", new Object[]{entity, field}, locale));
    }
}
