package org.kkonrad.cutyourcode.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@ToString
@Accessors(prefix = "m")
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExampleModel that = (ExampleModel) o;

        if (mSecondProperty != that.mSecondProperty) return false;
        if (mThirdProperty != that.mThirdProperty) return false;
        if (mFirstProperty != null ? !mFirstProperty.equals(that.mFirstProperty) : that.mFirstProperty != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mFirstProperty != null ? mFirstProperty.hashCode() : 0;
        result = 31 * result + mSecondProperty;
        result = 31 * result + (int) (mThirdProperty ^ (mThirdProperty >>> 32));
        return result;
    }
}
