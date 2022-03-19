package cigma.pfe.models;

import lombok.*;
import javax.persistence.*;
@Data
@AllArgsConstructor
@Entity(name = "Tclients")

@Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Client_Type")
@DiscriminatorValue("Client")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Client {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id ;
    private String name;

    public Client(String name) {
        this.name = name; }

    public Client(){}
}