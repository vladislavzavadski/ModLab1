package sample;

import java.util.List;

/**
 * Created by vladislav on 11.09.16.
 */
public class Model {
    private String queLength;
    private String aParamValue;
    private String R0ParamValue;
    private String MParamValue;
    private String CParamValue;

    public String getCParamValue() {
        return CParamValue;
    }

    public void setCParamValue(String CParamValue) {
        this.CParamValue = CParamValue;
    }

    private List<Integer> values;

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }

    public Model(String queLength, String aParamValue, String r0ParamValue, String MParamValue) {
        this.queLength = queLength;
        this.aParamValue = aParamValue;
        R0ParamValue = r0ParamValue;
        this.MParamValue = MParamValue;
    }

    public Model() {
    }

    public String getaParamValue() {
        return aParamValue;
    }

    public void setaParamValue(String aParamValue) {
        this.aParamValue = aParamValue;
    }

    public String getR0ParamValue() {
        return R0ParamValue;
    }

    public void setR0ParamValue(String r0ParamValue) {
        R0ParamValue = r0ParamValue;
    }

    public String getMParamValue() {
        return MParamValue;
    }

    public void setMParamValue(String MParamValue) {
        this.MParamValue = MParamValue;
    }

    public String getQueLength() {

        return queLength;
    }

    public void setQueLength(String queLength) {
        this.queLength = queLength;
    }
}
