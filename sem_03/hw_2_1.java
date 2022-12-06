// пример разбиения строк и собирания их обратно СтрингБилдером.
// аналог дз кратко

package sem_03;

public class hw_2_1 {
    
        public static void main(String[] args) {
        String data = "name: Ivan, lastName: Ivanov, country: Russia";
        
        StringBuilder builder = new StringBuilder();
        
        String[] parts = data.split (", ");
        for (String part : parts) {
        String[] keyValue = part.split (": ");
        String key = keyValue[0];
        String value = keyValue[1];
        
        builder.append (String.format (" AND %s = %s", key, value));
        }
        String request = builder.toString();
        request = request.substring(5);
        
        System.out.println(request);
        }
    
}
