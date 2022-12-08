package com.vti.controller;

import com.vti.dto.AccountDTO;
import com.vti.dto.DepartmentDTO;
import com.vti.dto.ProfileDTO;
import com.vti.entity.Account;
import com.vti.form.AccountCreateForm;
import com.vti.form.AuthUpdateForm;
import com.vti.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final ModelMapper mapper;
    @Autowired
    private IAccountService service;

    @PostMapping("/register")
    public void regiter(@RequestBody AccountCreateForm form){
        service.create(form);
    }
    @GetMapping("/login")
// Lấy ra thông tin cá nhân khi người dùng đã đăng nhập thành công
// Principal: Chứa username mà đăng nhập thành công trước đó

    public ProfileDTO login(Principal principal){
        String username = principal.getName();
        Account account = service.findByUsername(username);
        return mapper.map(account, ProfileDTO.class);
    }
    @PostMapping("/change")
    public void update (@RequestBody AuthUpdateForm form){
        service.update(form);
    }
}
