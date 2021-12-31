package br.com.ts.java.aplication.models.parent;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public class GenericEntry implements Serializable {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRemoved;
    private String key;
}