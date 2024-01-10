package springproject.teamandplayers.domaine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Player {
    @Id
    @GeneratedValue
    private int p_id;
    private String p_name;
}
