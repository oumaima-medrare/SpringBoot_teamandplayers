package springproject.teamandplayers.services;

import springproject.teamandplayers.domaines.Player;

import java.util.List;

public interface PlayerService {

    public List<Player> findAllPlayers();
    public Player findPlayer(Long id);
    public Player createPlayer(Player player);
    public void deletePlayer(Long id) ;
    public Player savePlayer(Player foundPlayer);

}
