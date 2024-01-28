package springproject.teamandplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springproject.teamandplayers.domaines.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
