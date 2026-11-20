package session11.classwork;
public class LibraryCatalogLookup {
    static String findBook(String[][] catalog,String targetIsbn){
        int min,med,max;
        min=0;
        max=catalog.length-1;
        med=min+(max-min)/2;
        while(min<=max){
            if(catalog[med][0].compareTo(targetIsbn)==0){
                return catalog[med][1];
            }
            else if(catalog[med][0].compareTo(targetIsbn)>0){
                max=med-1;
                med=min+(max-min)/2;
            }
            else if(catalog[med][0].compareTo(targetIsbn)<0){
                min=med+1;
                med=min+(max-min)/2;
            }
        }
        return "Not found";
    }
    public static void main(String[] args) {
        String[][] catalog = {{"0001112223", "Introduction to Algebra"},{"0002223334", "Beginning Python"},{"0003334445", "Classic Mythology"},{"0004445556", "Data and Society"},{"0005556667", "European History"}};
        String targetIsbn = "0003334445";
        System.out.println(findBook(catalog,targetIsbn));
        targetIsbn = "0009998887";
        System.out.println(findBook(catalog, targetIsbn));
    }
}
