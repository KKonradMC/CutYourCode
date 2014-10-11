package org.kkonrad.cutyourcode.model;


public class ExampleModel {

    private final String mFirstProperty;
    private int mSecondProperty;
    private long mThirdProperty;

    public ExampleModel(String firstProperty) {
        mFirstProperty = firstProperty;
    }

    public String getFirstProperty() {
        return mFirstProperty;
    }

    public int getSecondProperty() {
        return mSecondProperty;
    }

    public void setSecondProperty(int secondProperty) {
        mSecondProperty = secondProperty;
    }

    public long getThirdProperty() {
        return mThirdProperty;
    }

    public void setThirdProperty(long thirdProperty) {
        mThirdProperty = thirdProperty;
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
