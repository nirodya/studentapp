package lk.edu.javainstitute.studentclient.db;
// Generated Mar 31, 2016 12:59:48 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Question generated by hbm2java
 */
@Entity
@Table(name="question"
    ,catalog="studentapp"
)
public class Question  implements java.io.Serializable {


     private Integer idquestion;
     private String question;
     private String answer;

    public Question() {
    }

    public Question(String question, String answer) {
       this.question = question;
       this.answer = answer;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idquestion", unique=true, nullable=false)
    public Integer getIdquestion() {
        return this.idquestion;
    }
    
    public void setIdquestion(Integer idquestion) {
        this.idquestion = idquestion;
    }

    
    @Column(name="question")
    public String getQuestion() {
        return this.question;
    }
    
    public void setQuestion(String question) {
        this.question = question;
    }

    
    @Column(name="answer", length=65535)
    public String getAnswer() {
        return this.answer;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }




}


