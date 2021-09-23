package week4;
public class Main {

    public static void main(String[] args) {
        KitchenAppliances appliances = new KitchenAppliances();
        System.out.println("Appliances\n");
        for(Iterator iter = appliances.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println(name);
        }
    }
}