
package org.realtime.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import org.realtime.dao.models.User;
public interface UserRepository extends JpaRepository<User, Long> {

  //  User findByusername(String username);

    User findByExternalId(UUID id);

}
