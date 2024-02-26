package id.co.asyst.deep.training.springdatajpa.utility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Status {
    private String responseCode;
    private String responseDesc;
    private String responseMsg;
}
