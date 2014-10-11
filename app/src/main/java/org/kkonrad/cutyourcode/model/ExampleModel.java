package org.kkonrad.cutyourcode.model;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(prefix = "m")
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


    public ExampleModel(String firstProperty, int secondProperty, long thirdProperty){
        mFirstProperty = firstProperty;
        mSecondProperty = secondProperty;
        mThirdProperty = thirdProperty;
    }
    public ExampleModel() {
    }

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

    @Override
    public String toString() {
        return "ExampleModel{" +
                "mFirstProperty='" + mFirstProperty + '\'' +
                ", mSecondProperty=" + mSecondProperty +
                ", mThirdProperty=" + mThirdProperty +
                '}';
    }
}
