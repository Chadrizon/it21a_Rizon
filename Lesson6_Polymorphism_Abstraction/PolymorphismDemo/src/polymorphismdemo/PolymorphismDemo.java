package polymorphismdemo;

 

class DeliveryRider {
    protected String name;

    public DeliveryRider(String name) {
        this.name = name;
    }

    public void deliverOrder() {
        System.out.println(name + " delivers the order in a standard way.");
    }

    public double getDeliveryFee() {
        return 50.0;
    }
}

class BikeRider extends DeliveryRider {
    public BikeRider(String name) {
        super(name);
    }

    @Override
    public void deliverOrder() {
        System.out.println(name + " pedals through side streets to deliver the order (short distance only).");
    }

    @Override
    public double getDeliveryFee() {
        return 30.0;
    }
}

class MotorcycleRider extends DeliveryRider {
    public MotorcycleRider(String name) {
        super(name);
    }

    @Override
    public void deliverOrder() {
        System.out.println(name + " zooms through traffic on a motorcycle to deliver the order quickly.");
    }

    @Override
    public double getDeliveryFee() {
        return 60.0;
    }
}

class DroneRider extends DeliveryRider {
    public DroneRider(String name) {
        super(name);
    }

    @Override
    public void deliverOrder() {
        System.out.println(name + " flies over the city and drops the order at the customer's balcony.");
    }

    @Override
    public double getDeliveryFee() {
        return 120.0;
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {
        DeliveryRider[] riders = {
            new BikeRider("Mario"),
            new MotorcycleRider("Liza"),
            new DroneRider("Drone-X1"),
            new DeliveryRider("Walk-in Rider")
        };

        System.out.println("=== Today's Deliveries ===");
        for (DeliveryRider rider : riders) {
            rider.deliverOrder();
            System.out.println("   Delivery fee: PHP " + rider.getDeliveryFee());
            System.out.println();
        }
    }
}