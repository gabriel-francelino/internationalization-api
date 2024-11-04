package org.example.internationalization.service;

import org.example.internationalization.domain.User;
import org.example.internationalization.exception.NotFoundException;
import org.example.internationalization.repository.UserRepository;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

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

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new NotFoundException(messageSource, "User", "id"));
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
