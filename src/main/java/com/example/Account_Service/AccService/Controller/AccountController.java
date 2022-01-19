package com.example.Account_Service.AccService.Controller;


import com.example.Account_Service.AccService.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;


}
