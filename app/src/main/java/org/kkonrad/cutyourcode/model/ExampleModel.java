package org.kkonrad.cutyourcode.model;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@RequiredArgsConstructor(suppressConstructorProperties = true)//required only in Android
@Accessors(prefix = "m")
public class ExampleModel {
    private final String mFirstProperty;
    private int mSecondProperty;
    private long mThirdProperty;
}
