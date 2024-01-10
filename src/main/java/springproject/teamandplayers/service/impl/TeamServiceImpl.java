package springproject.teamandplayers.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springproject.teamandplayers.dao.TeamRepository;
import springproject.teamandplayers.domaine.Team;
import springproject.teamandplayers.service.TeamService;

import java.util.List;

@Service
@Transactional
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepository teamRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Team> findAllTeams() {
        return this.teamRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Team findTeam(Long id) {

        return this.teamRepository.findById(id).orElse(null);
    }

    @Override
    public Team createTeam(Team team) {
        return this.teamRepository.save(team);
    }

    @Override
    public void deleteTeam(Long id) {
        this.teamRepository.deleteById(id);
    }

    @Override
    public Team saveTeam(Team foundTeam) {
        return this.teamRepository.save(foundTeam);
    }
}
