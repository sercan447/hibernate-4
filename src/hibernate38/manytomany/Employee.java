
package hibernate38.manytomany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity  // Bunsuz Tablo oluşturulmaz.herzaman SInıfın üstünde Kullanınız.
@Table(name="Employe") //Bu anotasyon ile tablo isminizi verebilirsiniz.
public class Employee {
  //Her tabloda olması gereken benzersiz bir numara, onuda  aşağıda görüş oloduğunuz @Id Anotasyonu ile veriyorsunuz.
    @Id
    @SequenceGenerator(name="besleme_fisi" , sequenceName = "ALLAH")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "besleme_fisi")
    @Column(name="EMPLOYE_ID")
    private int id;

    @Column(name="NAME")
    private String name;

    @Column(name="SUR_NAME")
    private String surname;

    @ManyToMany
    @JoinTable(name="CASTIGI_ISLER",joinColumns={@JoinColumn(name="EMPLOYE_ID")})
    private List<Jobs> jobs = new ArrayList<Jobs>();

    public Employee() {
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Jobs> getJobs() {
        return jobs;
    }

    public void setJobs(List<Jobs> jobs) {
        this.jobs = jobs;
    }




}
