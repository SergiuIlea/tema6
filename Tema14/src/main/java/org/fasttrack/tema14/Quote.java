package org.fasttrack.tema14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quote {
    private int id;
    private String author;
    private String quote;
    private boolean favourite;
}
