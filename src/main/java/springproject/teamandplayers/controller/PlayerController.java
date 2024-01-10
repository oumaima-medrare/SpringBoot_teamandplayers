package springproject.teamandplayers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springproject.teamandplayers.domaine.Player;
import springproject.teamandplayers.service.PlayerService;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/players/{id}")
    public Player getPlayerById(@PathVariable Long id){
        return this.playerService.findPlayer(id);
    }

    @GetMapping("/players")
    public List<Player> getAllPlayers(){
        return this.playerService.findAllPlayers();
    }

    @PostMapping("/players")
    public Player createPlayer(@RequestBody Player player){
        return this.playerService.createPlayer(player);
    }

    @DeleteMapping("/players/{id}")
    public void deletePlayer(@PathVariable Long id){
        this.playerService.deletePlayer(id);
    }

    @PutMapping("/players/{id}")
    public Player updatePlayer(@RequestBody Player player, @PathVariable Long id){
        Player foundPlayer = this.playerService.findPlayer(id);

        if (foundPlayer != null){
            foundPlayer.setP_name(player.getP_name());
            this.playerService.savePlayer(foundPlayer);
        }

        return foundPlayer;
    }

}
