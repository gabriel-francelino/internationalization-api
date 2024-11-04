package org.example.internationalization;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

public class NotFoundException extends RuntimeException {
    public NotFoundException(MessageSource messageSource, String entity, String field) {
        super(messageSource.getMessage("user.notfound", new Object[]{entity, field}, LocaleContextHolder.getLocale()));
    }
}
