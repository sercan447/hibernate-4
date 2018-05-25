
package hibernate38.manytomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="JOBS")
public class Jobs {

    @Id
    @SequenceGenerator(name = "BESLEME" , sequenceName = "BESLEME_YERI")
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "BESLEME")
    @Column(name="JOB_ID")
    private int id;

    @Column(name="JOBS_NAME")
    private String name;

    public Jobs() {
    }

    public Jobs(String name) {
        this.name = name;
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





}
