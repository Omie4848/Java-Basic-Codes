public class Java24_StringPassByRef 
{
    // Method to update StringBuilder passed by reference
    public static void updateStringBuilder(StringBuilder sb) {
        sb.append(" Updated");
    }

    public static void main(String[] args) {
        StringBuilder myStringBuilder = new StringBuilder("Hello");

        System.out.println("Before update: " + myStringBuilder);

        // Passing the StringBuilder by reference to the update function
        updateStringBuilder(myStringBuilder);

        System.out.println("After update: " + myStringBuilder);
    }
}


// public class Main {
//     // Method to modify a StringBuilder
//     public static void modifyStringBuilder(StringBuilder sb) {
//         // sb.append(" World");
//     }

//     // Method to modify a String array (but not the strings themselves)
//     public static void modifyStringArray(String[] array) {

//         String temp=array[0];
//         array[0]=array[1];
//         array[1]=temp;

    
//     }

//     public static void main(String[] args) {
//         // Example with StringBuilder
//         StringBuilder sb = new StringBuilder();
        
//         // Example with String array
//         String[] strings = new String[] { "Hello", "World" };
//         modifyStringArray(strings);
//         System.out.println(strings[0]);  
//         System.out.println(strings[1]);  
//     }
// }

