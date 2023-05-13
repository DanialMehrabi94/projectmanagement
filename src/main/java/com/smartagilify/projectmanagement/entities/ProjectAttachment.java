package com.smartagilify.projectmanagement.entities;

import com.smartagilify.core.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Blob;

@Table(name = "PMS$T_PROJECT_ATTACHMENT")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectAttachment extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "PROJECT_ID", foreignKey = @ForeignKey(name = "FK_PROJECT_ATTACHMENT"))
    private Project project;

    @Lob
    @Column(name = "ATTACHMENT")
    private Blob attachment;

    @Column(name = "ATTACH_TYPE")
    private Long attachType;

}
