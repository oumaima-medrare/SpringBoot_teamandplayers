package springproject.teamandplayers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springproject.teamandplayers.domaines.Team;
import springproject.teamandplayers.services.TeamService;

import java.util.List;

@RestController
public class TeamController {
    @Autowired
    private TeamService teamService;

    @GetMapping("/teams/{id}")
    public Team getTeamById(@PathVariable Long id){
        return this.teamService.findTeam(id);
    }

    @GetMapping("/teams")
    public List<Team> getAllTeams(){
        return this.teamService.findAllTeams();
    }

    @PostMapping("/teams")
    public Team createTeam(@RequestBody Team team){
        return this.teamService.createTeam(team);
    }

    @DeleteMapping("/teams/{id}")
    public void deleteTeam(@PathVariable Long id){
        this.teamService.deleteTeam(id);
    }

    @PutMapping("/teams/{id}")
    public Team updateTeam(@RequestBody Team team, @PathVariable Long id){
        Team foundTeam = this.teamService.findTeam(id);
        if(foundTeam != null ){
            foundTeam.setT_name(team.getT_name());
            this.teamService.saveTeam(foundTeam);
        }
        return foundTeam;
    }







}
