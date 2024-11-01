package br.com.fiap.challenge3.repository;

import br.com.fiap.challenge3.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository  extends JpaRepository<Role, Long> {
    Optional<Role> findByNome(String nome);
}
