package com.example.HW16;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Note {
    @Id
    private Long id;
    private String title;
    private String content;

}
