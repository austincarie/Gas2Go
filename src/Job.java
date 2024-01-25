public class Job {
    //job constructor
    //variables for pay, distance, address, type of gas
    //get and set methods
    String address;
    String gasType;
    public Job(String address, String gasType){
        this.address = address;
        this.gasType = gasType;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    public String getGasType() {
        return gasType;
    }

    @Override
    public String toString() {
        return "Job{" +
                "Address: " + address +
                ", Gas Type: " + gasType +
                '}';
    }
}
