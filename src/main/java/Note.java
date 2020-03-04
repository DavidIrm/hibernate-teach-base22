import javax.persistence.*;

@Entity
@Table(name="note")

public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNota")
    public int idNota;

    @Column(name = "valoareNota")
    public int valoareNota;


    @ManyToOne
    @JoinColumn(name = "idElev")
    public Elev notaCareApartineDeElev;


    @Override
    public String toString() {
        return "Nota{" +
                "idNota=" + idNota +
                ", valoareNota='" + valoareNota + '\'' +
                ", notaCareApartineDeElev=" + notaCareApartineDeElev.idElev +
                ", notaCareApartineDeElev=" + notaCareApartineDeElev.numeElev +
                '}';
    }
}
