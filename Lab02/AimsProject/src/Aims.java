public class Aims {

    public static void main(String[] args) {
        // create a new cart
        Cart anOrder = new Cart();

        // create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 488637b (repush)
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
<<<<<<< HEAD
=======
=======
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);


        anOrder.removeDigitalVideoDisc(dvd2);
>>>>>>> fe7f75c491bfd479114e95ef0f1b65eed8201b9d
>>>>>>> 488637b (repush)


        // print total cost of the items in the cart
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());
    }

<<<<<<< HEAD
}

=======
<<<<<<< HEAD
}

=======
}
>>>>>>> fe7f75c491bfd479114e95ef0f1b65eed8201b9d
>>>>>>> 488637b (repush)
