package br.com.camilamlima.createuser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRespository extends JpaRepository<Phone, Long> {
    
}