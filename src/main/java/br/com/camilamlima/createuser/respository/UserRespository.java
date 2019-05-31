package br.com.camilamlima.createuser.repository;

import br.com.camilamlima.createuser.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long> {
    
}