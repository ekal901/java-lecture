public class ArrayEx13 {
    public static void main(String[] args) {
        System.out.println("Number of Args: " + args.length);
        for(int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
    }
}

// Result
// Number of Args: 3
// args[0] = "abc"
// args[1] = "123"
// args[2] = "Hello world"
