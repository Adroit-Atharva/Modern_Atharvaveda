public class Args {
    // Strings[] args is used to store all the command line arguments as an array of
    // strings and we are able to pass command line arguments using this
    public static void main(String[] args) {
        // Check if any arguments were provided
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            System.out.println("Command-line arguments provided:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
