package by.htp.hotel.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;
//import pojos.enums.CurrencyType;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.AccessType.PROPERTY;

@Entity
@Table(name = "ROOM_TYPE")
@OptimisticLocking(type = OptimisticLockType.VERSION)
@Cache(
       usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE,
//       usage = CacheConcurrencyStrategy.READ_WRITE,
       region = "pojos.RoomType",
       include = "non-lazy")

@Getter @Setter
@NoArgsConstructor
public class RoomType {
    private static final long serialVersionUID = 1L;

    @Id
    //for auto_increment id - use IDENTITY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    @Access(PROPERTY)
    // roomType_id	INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    private Long id;

    //roomType_name  	VARCHAR(30) NOT NULL,
    @Column(nullable = false, length = 30)
    @Access(PROPERTY)
    private String name;

    //roomType_seats 	INT NOT NULL,
    @Column(nullable = false)
    @Access(PROPERTY)
    private Integer seats;

    //roomType_price 		INT NOT NULL,
    @Column(nullable = false)
    @Access(PROPERTY)
    private Integer price;





    @Version
    @Access(PROPERTY)
    private Long version;

    //don't save in DB as field of Table ROOM_TYPE
   /* @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true,
            mappedBy = "roomType")*/
    /*@BatchSize(size = 3)     //specify the size for batch loading the entries of a lazy collection.
    @Access(PROPERTY)
    private List<> roomList = new ArrayList<>();

    public RoomType(String name, Integer seats, Integer price) {
        this.name = name;
        this.seats = seats;
        this.price = price;

    }*/





}
