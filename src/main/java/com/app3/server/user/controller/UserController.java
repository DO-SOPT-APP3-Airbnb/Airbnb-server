package com.app3.server.user.controller;

import com.app3.server.common.dto.ApiResponse;
import com.app3.server.common.exception.enums.SuccessType;
import com.app3.server.user.controller.dto.response.UserGetResponse;
import com.app3.server.user.domain.User;
import com.app3.server.user.repository.UserJpaRepository;
import com.app3.server.user.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // 목록 조회
    @GetMapping("/{id}")
    public ApiResponse<User> getUserProfile(@PathVariable Long id) {
        return ApiResponse.success(SuccessType.USER_SEARCH_SUCCESS, userService.getUserById(id));
    }
}
