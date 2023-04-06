package com.example.JobTrialPortal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "applicant")
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long a_id;

    @Column(name = "a_email")
    private String a_email;

    @Column(name = "a_password")
    private String a_password;

    @Column(name = "a_username")
    private String a_username;

    @Column(name = "a_description")
    private String a_description;


}
