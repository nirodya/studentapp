package lk.edu.javainstitute.studentclient.db;
// Generated Mar 31, 2016 12:59:48 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Marks generated by hbm2java
 */
@Entity
@Table(name="marks"
    ,catalog="studentapp"
)
public class Marks  implements java.io.Serializable {


     private Integer idmarks;
     private Stdent stdent;
     private Subject subject;
     private Integer marks;
     private Date date;

    public Marks() {
    }

	
    public Marks(Stdent stdent, Subject subject) {
        this.stdent = stdent;
        this.subject = subject;
    }
    public Marks(Stdent stdent, Subject subject, Integer marks, Date date) {
       this.stdent = stdent;
       this.subject = subject;
       this.marks = marks;
       this.date = date;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idmarks", unique=true, nullable=false)
    public Integer getIdmarks() {
        return this.idmarks;
    }
    
    public void setIdmarks(Integer idmarks) {
        this.idmarks = idmarks;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="stdent_NIC", nullable=false)
    public Stdent getStdent() {
        return this.stdent;
    }
    
    public void setStdent(Stdent stdent) {
        this.stdent = stdent;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="subject_idsubject", nullable=false)
    public Subject getSubject() {
        return this.subject;
    }
    
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    
    @Column(name="marks")
    public Integer getMarks() {
        return this.marks;
    }
    
    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date", length=10)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }




}

