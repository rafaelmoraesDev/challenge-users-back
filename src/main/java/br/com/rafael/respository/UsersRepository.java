package br.com.rafael.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafael.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

}
