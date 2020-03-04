import javax.persistence.*;

@Entity
@Table(name="profesori")
public class Profesori {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idProfesor")
    public int idProfesor;

    @Column(name="numeProfesor")
    public String numeProfesor;


    @Override
    public String toString() {
        return "Profesori{" +
                "idProfesor=" + idProfesor +
                ", numeProfesor='" + numeProfesor + '\'' +
                '}';
    }
}
