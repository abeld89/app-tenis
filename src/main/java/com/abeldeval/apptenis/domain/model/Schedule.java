package com.abeldeval.apptenis.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String day;

    private String fromHour;

    private String toHour;

    @ManyToMany(mappedBy = "schedules")
    private List<User> user;
}
