package app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.model.ERole;
import app.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>  {
	 Optional<Role> findByName(ERole name);
}
