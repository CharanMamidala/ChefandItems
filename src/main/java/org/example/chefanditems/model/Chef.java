package org.example.chefanditems.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
public class Chef {
    @Id
    private String id;
    private String name;
    private String email;
}
