package org.example.internationalization;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final MessageSource messageSource;

    public UserService(UserRepository userRepository, MessageSource messageSource) {
        this.userRepository = userRepository;
        this.messageSource = messageSource;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findById(Long id, Locale locale) {
        return userRepository.findById(id).orElseThrow(() -> new NotFoundException(messageSource, "User", "id", locale));
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
