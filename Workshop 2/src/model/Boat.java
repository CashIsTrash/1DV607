package model;

public class Boat {

    private int boatCounter = 0;
	private int length;
    private String boatType;

    public Boat(String boatType, int length, int boatId) {
        this.boatType = boatType;
        this.length = length; //length in centimeters
        this.boatCounter = boatId;
    }
    public Boat(){

    }

    public int getLength() {
        return length;
    }

    void setLength(int length) {
        this.length = length;
    }

    public String getType() {
        return boatType;
    }

    public void setBoatType(String boatType) {
        this.boatType = boatType;
    }

    public int getBoatCounter() {
		return boatCounter;
	}

    public void setBoatInfo(int changeLength, String changeBoatType) throws Exception {
    	if(getType()== null)
    		throw new RuntimeException("There is no Boat!");
        setLength(changeLength);
        setBoatType(changeBoatType);
    }

    @Override
    public String toString() {
        return "Type: " + " " + this.boatType + " , " + "length: " + this.length + " , " + "id: " + this.boatCounter + "\n";
    }
    
}
