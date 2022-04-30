package com.chwex.conferencedemoapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity(name = "speakers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Getter
@Setter
@NoArgsConstructor
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long speaker_id;
    @NotBlank(message = "first name is mandatory")
    private String first_name;
    @NotBlank(message = "last name is mandatory")
    private String last_name;
    @NotBlank(message = "title is mandatory")
    private String title;
    @NotBlank(message = "company is mandatory")
    private String company;
    @NotBlank(message = "bio is mandatory")
    private String speaker_bio;
    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] speaker_photo;

    @ManyToMany(mappedBy = "speakers")
    @JsonIgnore
    private List<Session> sessions;
}
