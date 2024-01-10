package springproject.teamandplayers.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springproject.teamandplayers.domaine.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
