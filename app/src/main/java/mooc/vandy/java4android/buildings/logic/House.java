package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {
    private String mOwner = null;
    private boolean mPool = false;

    House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
    }

    House(int length, int width, int lotLength, int lotWidth, String owner) {
        this(length, width, lotLength, lotWidth);
        mOwner = owner;
    }

    House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        this(length, width, lotLength, lotWidth, owner);
        this.mPool = pool;
    }

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public boolean hasPool() {
        return mPool;
    }

    public void setPool(boolean mPool) {
        this.mPool = mPool;
    }

    public String toString() {
        String owner = mOwner != null ? mOwner : "n/a";
        String hasPool = mPool ? "; has a pool" : "";
        String openSpace = calcLotArea() > calcBuildingArea() ? "; has a big open space" : "";
        return "Owner: " + owner + hasPool + openSpace;
    }

    public boolean equals(Object o) {
        if (o instanceof Building) {
            House obj = (House) o;
            return calcBuildingArea() == obj.calcBuildingArea() && hasPool() == obj.hasPool();
        }
        return false;
    }
}
