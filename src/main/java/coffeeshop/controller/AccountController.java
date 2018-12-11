package coffeeshop.controller;

import coffeeshop.domain.Account;
import coffeeshop.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by bci on 12/9/18 at 2:04 PM
 */
@RestController
@RequestMapping("/accounts")
public class AccountController{

    @Autowired
    private AccountService accountService;


/*    @PostMapping(value = "/account",
            produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<Account> createGalaxy(@RequestBody Account account) {
        if (account != null) {
            Account savedAccount = accountService.saveAccount(account);
            return new ResponseEntity<>(savedAccount, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }*/

    @RequestMapping(method = RequestMethod.GET, produces = "application/json", path = "/{username}")
    private Account getAccountByUserName(@PathVariable("username") String username) {
        return accountService.getAccountByUserName(username);
    }

    @RequestMapping(method = RequestMethod.POST)
    private Long saveAccount(@RequestBody Account account) {
        accountService.saveOrUpdate(account);
        return account.getId();
    }
}
