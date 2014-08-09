package mapper;

/**
 * This class provid facility to map from arduino components to jaxb and inversely
 * 
 * @author leo
 */
public class CaramelMapper {
    
    /**
     * Pass in instance classes of the repo ArduinoComponents. 
     * <br/>I.e: Linear potentiometer, continous servo and so on  
     */
    public CaramelMapper() {}
    
    /**
     * Use the value of instance classes of arduino components to map to a JAXB class
     * <br/>For example, use the value given by a linear potentiometer to give the state position of a jaxb class 
     */
    public void map() {}
    
    /**
     * From jaxb instance values set values to arduino components class(es)
     */
    public void unmap() {}
}
