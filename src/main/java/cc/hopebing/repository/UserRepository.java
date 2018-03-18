package cc.hopebing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cc.hopebing.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

    Long deleteById(Long id);
}