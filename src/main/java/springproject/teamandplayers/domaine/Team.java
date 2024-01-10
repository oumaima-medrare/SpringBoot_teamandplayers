package springproject.teamandplayers.domaine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Team {

    @Id
    @GeneratedValue
    private Long t_id;
    private String t_name;
}
