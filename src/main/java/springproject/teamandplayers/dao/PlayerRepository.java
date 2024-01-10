package springproject.teamandplayers.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springproject.teamandplayers.domaine.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
