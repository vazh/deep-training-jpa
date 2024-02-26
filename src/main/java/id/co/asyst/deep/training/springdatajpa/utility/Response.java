package id.co.asyst.deep.training.springdatajpa.utility;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Response<T> {
    private Status status;

    private T result;
}
