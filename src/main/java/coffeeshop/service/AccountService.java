package coffeeshop.service;

import coffeeshop.domain.Account;
import coffeeshop.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bci on 12/9/18 at 2:05 PM
 */
@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public void saveOrUpdate(Account account) {
        accountRepository.save(account);
    }

    public Account getAccountByUserName(String username) {
        return accountRepository.findByUserName(username);
    }
}
