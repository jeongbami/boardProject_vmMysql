package com.project.boarddbproject.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //table임을 명시하는 어노테이션
@Data //board class의 query를 data로 받아들이는 anotation
public class Board {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer boardIndex;

    private String boardTitle;
    private String boardContent;

}
