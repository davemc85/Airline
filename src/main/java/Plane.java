public class Plane {

    private PlaneType plane;

    public Plane(PlaneType plane){
        this.plane = plane;
    }


    public int getCapacity() {
        return this.plane.getCapacity();
    }

    public int getTotalWeight(){
        return this.plane.getTotalWeight();
    }



}
