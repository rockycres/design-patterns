package patterns.creational.builder;

class House {

    String flooring;
    String roofing;
    String interior;


    public House(HouseBuilder houseBuilder) {
        this.flooring = houseBuilder.flooring;
        this.roofing = houseBuilder.roofing;
        this.interior = houseBuilder.interior;
    }


    static class HouseBuilder {



        String flooring;
        String roofing;
        String interior;


        public HouseBuilder(String flooring, String roofing) {
            this.roofing = roofing;
            this.flooring = flooring;
        }

        public HouseBuilder addInterior(String interior) {
            this.interior = interior;
            return this;
        }



        public House build(){
            return new House(this);
        }


    }

}