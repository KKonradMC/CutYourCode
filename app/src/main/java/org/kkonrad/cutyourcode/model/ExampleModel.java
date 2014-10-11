package org.kkonrad.cutyourcode.model;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@ToString
@Accessors(prefix = "m")
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)
@EqualsAndHashCode
public class ExampleModel {

    @Getter
    @Setter
    private String mFirstProperty;
    @Getter
    @Setter
    private int mSecondProperty;
    @Getter
    @Setter
    private long mThirdProperty;
}
