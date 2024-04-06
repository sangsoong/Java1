package section04;

class Car {
    int maxSpeed;
    String carName;
    String maker;

    Car(String maker) {
        this.maker = maker;
    }

    void printInfo() {
        System.out.println("차량: " + carName);
        System.out.println("연식: " + maxSpeed);
        System.out.println("메이커: " + maker);
    }

    int returnMaxSpeed() {
        return maxSpeed;
    }

    String returnMaxSpeedString() {
        String name = this.carName;
        return name + "의 최대속도: " + maxSpeed;
    }
}
