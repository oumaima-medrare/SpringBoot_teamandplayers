package springproject.teamandplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springproject.teamandplayers.domaines.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
