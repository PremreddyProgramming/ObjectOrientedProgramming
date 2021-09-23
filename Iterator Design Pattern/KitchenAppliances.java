package week4;

public class KitchenAppliances implements Container {
    public String appliances[] = {"Oven" , "Microwave" ,"Cooker" , "CoffeeMaker","Electric Whisk"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if(index < appliances.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return appliances[index++];
            }
            return null;
        }
    }
}
