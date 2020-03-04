import javax.persistence.*;

@Entity
@Table(name="materii")

public class Materii {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idMaterie")
    public int idMaterie;

    @Column(name="numeMaterie")
    public String numeMaterie;

    @Override
    public String toString() {
        return "Materii{" +
                "idMaterie=" + idMaterie +
                ", numeMaterie='" + numeMaterie + '\'' +
                '}';
    }
}
