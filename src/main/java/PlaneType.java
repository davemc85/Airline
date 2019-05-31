public enum PlaneType {

    BOEING747(100, 80000);

    private final int capacity; Long totalWeight;

    PlaneType(int capacity, long totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return capacity;
    }

    public long getTotalWeight() {
        return totalWeight;
    }
}
