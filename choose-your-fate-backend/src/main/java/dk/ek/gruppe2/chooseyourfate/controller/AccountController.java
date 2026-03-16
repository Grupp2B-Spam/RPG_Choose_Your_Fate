package dk.ek.gruppe2.chooseyourfate.controller;

import dk.ek.gruppe2.chooseyourfate.dto.AccountResponseDTO;
import dk.ek.gruppe2.chooseyourfate.dto.CreateAccountRequestDTO;
import dk.ek.gruppe2.chooseyourfate.service.mysql.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<AccountResponseDTO> getAllAccounts() {
        return accountService.getAll();
    }

    @GetMapping("/{id}")
    public AccountResponseDTO getAccountById(@PathVariable Integer id) {
        return accountService.getById(id);
    }

    @PostMapping
    public AccountResponseDTO createAccount(@RequestBody CreateAccountRequestDTO request) {
        return accountService.createAccount(request);
    }
}