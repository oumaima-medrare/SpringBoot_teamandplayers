package springproject.teamandplayers.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springproject.teamandplayers.repositories.TeamRepository;
import springproject.teamandplayers.domaines.Team;
import springproject.teamandplayers.services.TeamService;

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
    @Transactional
    public Team createTeam(Team team) {
        return this.teamRepository.save(team);
    }

    @Override
    @Transactional
    public void deleteTeam(Long id) {
        this.teamRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Team saveTeam(Team foundTeam) {
        return this.teamRepository.save(foundTeam);
    }
}
