package ru.readerproject.readerproject.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class BookRequest {

    @NotBlank
    @Length(min = 0, max = 30)
    private String name;

    @NotNull
    private Integer type;

}
