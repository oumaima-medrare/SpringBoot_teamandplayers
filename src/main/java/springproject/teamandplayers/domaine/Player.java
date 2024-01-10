package springproject.teamandplayers.domaine;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Player {
    @Id
    @GeneratedValue
    private int p_id;
    private String p_name;

    @ManyToOne
    private Team team;
}
