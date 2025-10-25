package com.enigmacamp.cashflowManagement;

public class AnimalApp {
//    Parent class
    class Animal {
        int kaki;
        String bulu;
        String warna;

    public Animal( int kaki, String bulu, String warna){
        this.kaki = kaki;
        this.bulu = bulu;
        this.warna = warna;
    }

        public void eat () {
        System.out.println("Animal eat");
    }

    public void sleep () {
        System.out.println("Animal sleep");
    }

        public int getKaki() {
            return kaki;
        }

        public void setKaki(int kaki) {
            this.kaki = kaki;
        }

        public String getBulu() {
            return bulu;
        }

        public void setBulu(String bulu) {
            this.bulu = bulu;
        }

        public String getWarna() {
            return warna;
        }

        public void setWarna(String warna) {
            this.warna = warna;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "kaki=" + kaki +
                    ", bulu='" + bulu + '\'' +
                    ", warna='" + warna + '\'' +
                    '}';
        }
    };

//    Subclass
    class Cat extends Animal implements Walkable {
        public Cat(int kaki, String bulu, String warna){
            super(kaki, bulu, warna);
        }

    @Override
    public void eat() {
            System.out.println("Cat eat");
    }
    @Override
    public void sleep() {
            System.out.println("Cat sleep");
    }

    public void walk () {
            System.out.println("Cat walk");
    }

    public void run() {
            System.out.println("Cat run");
    }

    public void jump() {
            System.out.println("Cat jump");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "kaki=" + kaki +
                ", bulu='" + bulu + '\'' +
                ", warna='" + warna + '\'' +
                '}';
    }
}

    class Dog extends Animal {
        public Dog(int kaki, String bulu, String warna){
            super(kaki, bulu, warna);
        }

    @Override
    public String toString() {
        return "Dog{" +
                "kaki=" + kaki +
                ", bulu='" + bulu + '\'' +
                ", warna='" + warna + '\'' +
                '}';
    }
}

//    Interface
    interface Walkable{
        void walk();
        void run();
        void jump();
}


}
