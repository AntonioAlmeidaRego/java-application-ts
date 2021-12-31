package br.com.ts.java.aplication.models;

import br.com.ts.java.aplication.models.parent.GenericEntry;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "tb_photograph")
@Entity
@Setter
@Getter
public class Photograph extends GenericEntry {

}