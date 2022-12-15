import java.util.*;

class Homework {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<> ();
        laptops.add (new Laptop ("DELL", "234324"));
        laptops.add (new Laptop ("Acer", "54354"));
        laptops.add (new Laptop ("Lenova", "AABDBD"));
        laptops.add (new Laptop ("Acer", "8888888"));
        laptops.add (new Laptop ("DELL", "234999"));

        Map<String, String> filters = new HashMap<> ();
        filters.put ("producer", "DELL");
        filters.put ("model", null);

        List<Laptop> filtered = new ArrayList<> ();
        for (Laptop laptop : laptops) {

            String filterProducer = filters.get ("producer");
            if (filterProducer != null  // если требование по фильтру есть
                && !filterProducer.equals (laptop.getProducer())) {  // и фильтр не прошёл
                    continue;
            }

            String filterModel = filters.get ("model");
            if (filterModel != null  // если требование по фильтру есть
                && !filterModel.startsWith(laptop.getProducer())) {  // и фильтр не прошёл
                    continue;
            }

            filtered.add (laptop);
        }

        System.out.println(filtered);
    }
}
