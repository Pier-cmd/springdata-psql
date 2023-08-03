

package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.User;

import javax.swing.plaf.basic.BasicComboPopup;
import java.util.List;
import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findByName(String name);

    List<User> findUsingByNameIgnoreCase(String name);

    List<User> findUsingByNameContainingIgnoreCase(String name);

    Optional<User> findById(Integer integer);

}
