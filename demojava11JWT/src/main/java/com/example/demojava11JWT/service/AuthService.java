package com.example.demojava11JWT.service;

import com.example.demojava11JWT.dto.LoginDto;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    String login(LoginDto loginDto);
}
