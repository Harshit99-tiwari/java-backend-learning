package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Book {

    @Id
    private int bid;
    private String bname;
    private int bprice;
    private String bauthor;

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }
    public int getBprice() {
        return bprice;
    }
    public void setBprice(int bprice) {
        this.bprice = bprice;
    }
    public String getBname() {
        return bname;
    }
    public void setBname(String bname) {
        this.bname = bname;
    }
    public int getBid() {
        return bid;
    }
    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname=" + bname +
                ", bprice=" + bprice +
                ", bauthor=" + bauthor +
                '}';
    }
}
