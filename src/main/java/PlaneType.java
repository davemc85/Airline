public enum PlaneType {

    BOEING747(100, 80000),
    CIRRUSSR22(4, 17500),
    GULFSTREAMG650(18, 40000);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
