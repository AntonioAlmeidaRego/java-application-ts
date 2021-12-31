package br.com.ts.java.aplication.models;

import br.com.ts.java.aplication.models.parent.GenericEntry;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "tb_category")
@Entity
@Getter
@Setter
public class Category extends GenericEntry {
    private String name;
}