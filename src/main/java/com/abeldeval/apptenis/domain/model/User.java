package com.abeldeval.apptenis.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String password;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;

    private String bankAccount;

    @JoinTable(
            name = "rel_user_schedule",
            joinColumns = @JoinColumn(name = "user_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name="schedule_id", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Schedule> schedules;

}
