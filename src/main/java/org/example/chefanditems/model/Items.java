package org.example.chefanditems.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;


@Data
@Document(collection = "items")
public class Items {
    @Id
    private String id;
    private String itemname;
    private String chefId;
}
