package springproject.teamandplayers.domaines;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Team {

    @Id
    @GeneratedValue()
    private Long t_id;
    private String t_name;

    @OneToMany(mappedBy = "team")
    private List<Player> players;
}
