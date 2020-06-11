package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {
    static private int sTotalOffices = 0;
    private String mBusinessName = null;
    private int mParkingSpaces = 0;

    Office(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        mBusinessName = null;
        mParkingSpaces = 0;
        sTotalOffices++;
    }

    Office(int length, int width, int lotLength, int lotWidth, String businessName) {
        this(length, width, lotLength, lotWidth);
        mBusinessName = businessName;
    }

    Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces) {
        this(length, width, lotLength, lotWidth, businessName);
        mParkingSpaces = parkingSpaces;
    }

    public String getBusinessName() {
        return mBusinessName;
    }

    public void setBusinessName(String mBusinessName) {
        this.mBusinessName = mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public void setParkingSpaces(int mParkingSpaces) {
        this.mParkingSpaces = mParkingSpaces;
    }

    public String toString() {
        String businessName = mBusinessName != null ? mBusinessName : "unoccupied";
        String parkingSpaces = mParkingSpaces > 0 ? "; has " + mParkingSpaces + " parking spaces" : "";
        String totalOffices = " (total offices: " + sTotalOffices + ")";
        return "Business: " + businessName + parkingSpaces + totalOffices;
    }

    public boolean equals(Object o) {
        if (o instanceof Office) {
            Office obj = (Office) o;
            return calcBuildingArea() == obj.calcBuildingArea() && mParkingSpaces == obj.getParkingSpaces();
        }
        return false;
    }
}
