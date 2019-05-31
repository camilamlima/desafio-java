package br.com.camilamlima.createuser;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRespository userRespository;

    public List<User> findAll() {
        return userRespository.findAll();
    }

    public Optional<User> findById(Long id) {
        return userRespository.findById(id);
    }

    public User save(User stock) {
        return userRespository.save(stock);
    }

}