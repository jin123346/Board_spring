package com.farmstory.entity;

import com.farmstory.dto.CateDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="Cate")
public class Cate {

    @Id
    private int cateNo;
    private String cateGroup;
    private String cateName;


    public CateDTO toDTO() {
        return  CateDTO.builder().cateNo(cateNo).cateGroup(cateGroup).cateName(cateName).build();
    }


}
