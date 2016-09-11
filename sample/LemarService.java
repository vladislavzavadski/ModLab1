package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladislav on 11.09.16.
 */
public class LemarService {

    public List<Integer> getRandomNumbersQue(Model model) throws InvalidParameterException {
        if(model.getaParamValue()==null||model.getaParamValue().isEmpty()){
            throw new InvalidParameterException("Parameter a is invalid");
        }
        if(model.getMParamValue()==null||model.getMParamValue().isEmpty()){
            throw new InvalidParameterException("Parameter M is invalid");
        }
        if(model.getQueLength()==null||model.getQueLength().isEmpty()){
            throw new InvalidParameterException("Parameter que length is invalid");
        }
        if(model.getR0ParamValue()==null||model.getR0ParamValue().isEmpty()){
            throw new InvalidParameterException("Parameter R0 is invalid");
        }
        if(model.getCParamValue()==null||model.getCParamValue().isEmpty()){
            throw new InvalidParameterException("Parameter c is invalid");
        }

        int a = Integer.parseInt(model.getaParamValue());
        int M = Integer.parseInt(model.getMParamValue());
        int length = Integer.parseInt(model.getQueLength());
        int R0 = Integer.parseInt(model.getR0ParamValue());
        int c = Integer.parseInt(model.getCParamValue());

        List<Integer> result = new ArrayList<>(length);
        result.add(R0);
        for (int i=0; i<length; i++){
            result.add((a*result.get(i)+c)%M);
        }
        return result;
    }
}
