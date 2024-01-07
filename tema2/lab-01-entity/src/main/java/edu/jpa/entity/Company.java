package edu.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Company")
@SecondaryTable(name = "CompanyDetail",
                pkJoinColumns = @PrimaryKeyJoinColumn(name = "Company_id",
                                                      referencedColumnName = "Company_id"))
public class Company {
    @Id
    @Column(name = "Company_id", table = "Company")
    private int id;
    @Column(name = "Name", table = "Company")

    private String name;
    @Column(name = "Address", table = "Company")

    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
