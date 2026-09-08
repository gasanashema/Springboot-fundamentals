package rw.ac.auca.store.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "address")
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "zip")
    private String zip;

    //the address is the owner of the relationship, because on each address we must know the user (owner) of the address
    @ManyToMany
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    private User user;
}
