package springproject.teamandplayers.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springproject.teamandplayers.repositories.PlayerRepository;
import springproject.teamandplayers.domaines.Player;
import springproject.teamandplayers.services.PlayerService;

import java.util.List;

@Service
@Transactional
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Player> findAllPlayers() {
        return this.playerRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Player findPlayer(Long id) {
        return this.playerRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Player createPlayer(Player player) {
        return this.playerRepository.save(player);
    }

    @Override
    @Transactional
    public void deletePlayer(Long id) {
        this.playerRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Player savePlayer(Player foundPlayer) {
        return this.playerRepository.save(foundPlayer);
    }
}
