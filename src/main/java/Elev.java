import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="elevi")
public class Elev {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idElev")
    public int idElev;






    @OneToMany(mappedBy = "notaCareApartineDeElev")
    public List<Note> note;


    @Column(name="numeElev")
    public String numeElev;

   //--nu mai avem nevoie pentru ca am creat obiectul clasaDeCareApartineElevul
   // in joinColum si stie cum sa faca referinta din clasa Clasa
//    @Column(name="idClasa")
//    public int idClasa;

    @ManyToOne//mai multi elevi -> la o singura clasa
    @JoinColumn(name="idClasa")
    public Clasa clasaDeCareApartineElevul;//declararea fieldului de tip Clasa


    @Override
    public String toString() {
        return "Elev{" +
                "idElev=" + idElev +
                ", numeElev='" + numeElev + '\'' +
                ", idClasa=" + clasaDeCareApartineElevul.idClasa +
                ", numeClasa=" + clasaDeCareApartineElevul.numeClasa +
                ", note=" + note +
                '}';
    }
}
