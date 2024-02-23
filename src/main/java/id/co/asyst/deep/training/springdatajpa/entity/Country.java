package id.co.asyst.deep.training.springdatajpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Country implements Serializable {
    @Id
    private UUID id;
    private String name;
    private String phoneCode;

    @Column(unique = true)
    private String isoCode2;

    @Column(unique = true)
    private String isoCode3;

    @Column(unique = true)
    private String numCode;

    @Column(unique = true)
    private String tld;
}
