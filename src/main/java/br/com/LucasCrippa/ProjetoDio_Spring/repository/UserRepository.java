package br.com.LucasCrippa.ProjetoDio_Spring.repository;

import br.com.LucasCrippa.ProjetoDio_Spring.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}