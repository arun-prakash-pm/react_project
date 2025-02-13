package app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.model.PanelUser;
@Repository
public interface PanelUserRepository extends JpaRepository<PanelUser, Long> {
	Optional<PanelUser> findByUsername(String username);
	
	Boolean existsByUsername(String username);
	
	Boolean existsByEmail(String email);
}
