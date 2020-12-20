package com.simple.user.application.simpleuserapplication.Repository;

import com.simple.user.application.simpleuserapplication.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
