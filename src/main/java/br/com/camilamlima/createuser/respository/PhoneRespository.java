package br.com.camilamlima.createuser.repository;

import br.com.camilamlima.createuser.domain.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRespository extends JpaRepository<Phone, Long> {
    
}