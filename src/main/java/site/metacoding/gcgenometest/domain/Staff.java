package site.metacoding.gcgenometest.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//2, ERD를 바탕으로 JPA entity를 작성해주세요

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Staff {

    @Id
    private Integer staffNumber;

    private String staffName;
    private String position;
    private String teamposition;
    private Integer phone;
    private Date joiningDate;

    @Column(nullable = true)
    private Date closingDate;

    @JoinColumn(name = "departmentCode")
    @ManyToOne
    private Department department;

}
