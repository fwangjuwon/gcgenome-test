1. ERD 
<img width="411" alt="Screenshot_12" src="https://user-images.githubusercontent.com/97711663/178205290-39e59886-27da-4708-b9c4-5ffa2cd155b9.png">

<br/>

2. JPA entity code
- Staff
```
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
```
- Department
```
@Entity
public class Department {

    @Id
    private String code;
    private String departmentName;

}
```

3. 직원목록 전체 조회
```
StaffService.java 참고
```

4. 특정직원 전체 조회
```
StaffService.java 참고
```

5. 신규직원 추가
```
StaffService.java 참고
```