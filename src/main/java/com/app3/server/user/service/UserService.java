package com.app3.server.user.service;

import com.app3.server.common.exception.enums.ErrorType;
import com.app3.server.common.exception.model.NotFoundException;
import com.app3.server.user.controller.dto.response.UserGetResponse;
import com.app3.server.user.domain.User;
import com.app3.server.user.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserJpaRepository userJpaRepository;

    public User getUserById(Long id) {
        return userJpaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(ErrorType.USER_NOT_FOUND_EXCEPTION));
    }
}

