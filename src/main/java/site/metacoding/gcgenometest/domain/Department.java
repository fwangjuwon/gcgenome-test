package site.metacoding.gcgenometest.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

//2, ERD를 바탕으로 JPA entity를 작성해주세요

@Entity
public class Department {

    @Id
    private String code;
    private String departmentName;

}
