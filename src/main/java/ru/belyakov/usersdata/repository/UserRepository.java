package ru.belyakov.usersdata.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.belyakov.usersdata.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
