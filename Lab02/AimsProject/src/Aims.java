public class Aims {

    public static void main(String[] args) {
        // create a new cart
        Cart anOrder = new Cart();

        // create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);

//        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
//        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        
    //  method add DVDs với số lượng tham số truyền vào là tùy ý
//        anOrder.addDigitalVideoDisc1(dvd1, dvd2, dvd3);
        
     // method add DVDs với tham số là array
//        DigitalVideoDisc[] discList = {dvd1, dvd3};
//        anOrder.addDigitalVideoDisc(discList);


        
        anOrder.addDigitalVideoDisc(dvd2, dvd3);

        anOrder.addDigitalVideoDisc(dvd1);



        anOrder.removeDigitalVideoDisc(dvd2);


        // print total cost of the items in the cart
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());
}
}

