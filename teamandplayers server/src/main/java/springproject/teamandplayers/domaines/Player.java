package springproject.teamandplayers.domaines;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Player {
    @Id
    @GeneratedValue
    private int p_id;
    private String p_name;

    @ManyToOne
    @JoinColumn(name = "t_id")
    private Team team;
}
