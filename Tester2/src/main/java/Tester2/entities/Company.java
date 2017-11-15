package Tester2.entities;

import javax.persistence.*;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "NUMBER_OF_EMP")
    private Integer numberOfEmployees;

    @Column(name = "foundation_year")
    private Integer foundationYear;


}
