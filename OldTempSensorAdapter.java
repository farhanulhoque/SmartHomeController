//package itec3030.assignments.a2;


import itec3030.smarthome.standards.ControllerInterface;   
//import itec3030.smarthome.standards.NumericMeasurementInstrument;
import itec3030.smarthome.standards.TemperatureSensor;
import oldtempinc.drivers.OldTempSensor;
//import oldtempinc.hardware.OldSensorDevice;


public class OldTempSensorAdapter extends OldTempSensor implements TemperatureSensor {
	
	/**
	 * @param
	 * @return
	 * 
	 * instantiates OldTempSensor class as an adapter architecture for the main class.  
	 *
	 */
	OldTempSensor x = new OldTempSensor();
	

	@Override
	public void disable() {
		
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean enabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ControllerInterface getController() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setController(ControllerInterface arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setID(String arg0) {
		
	}

	/** 
	 * 
	 * @return y (integer)temperature ---- converts (float)getTemperature() into integer 
	 * 
	 */
	@Override
	public int getReading() {
		int y = (int)x.getTemperature();
		return y;
	}

	/**
	* @param arg0 temperature in the form of an integer
	*
	*/
	@Override
	public void newTemperature(int arg0) {
		x.newTemperature((float)arg0);;
		
	}

	
	
}
