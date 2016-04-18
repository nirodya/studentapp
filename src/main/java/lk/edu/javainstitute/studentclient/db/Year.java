package lk.edu.javainstitute.studentclient.db;
// Generated Mar 31, 2016 12:59:48 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Year generated by hbm2java
 */
@Entity
@Table(name="year"
    ,catalog="studentapp"
)
public class Year  implements java.io.Serializable {


     private Integer idyear;
     private String year;
     private Set<Subject> subjects = new HashSet<Subject>(0);

    public Year() {
    }

    public Year(String year, Set<Subject> subjects) {
       this.year = year;
       this.subjects = subjects;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idyear", unique=true, nullable=false)
    public Integer getIdyear() {
        return this.idyear;
    }
    
    public void setIdyear(Integer idyear) {
        this.idyear = idyear;
    }

    
    @Column(name="year", length=45)
    public String getYear() {
        return this.year;
    }
    
    public void setYear(String year) {
        this.year = year;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="year")
    public Set<Subject> getSubjects() {
        return this.subjects;
    }
    
    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }




}


