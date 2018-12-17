package coffeeshop.repository;


import coffeeshop.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bci on 12/9/18 at 2:05 PM
 */
@Transactional
@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findByUserName(String username);
}
