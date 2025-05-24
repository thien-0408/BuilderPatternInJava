public class Main1 {
    public static void main(String[] args) {
        Client client = new Client();

        System.out.println("Creating Normal Document:");
        Document normalDoc = client.newDocument("normal");
        System.out.println();

        System.out.println("Creating Confidential Document:");
        Document confidentialDoc = client.newDocument("confidential");
        System.out.println();


//        System.out.println("=== Document Summary ===");
//        if (normalDoc != null) {
//            System.out.println("Normal Doc - Extension: " + normalDoc.getExtension() +
//                    ", Encryption: " + normalDoc.getEncryption());
//        }

//        if (confidentialDoc != null) {
//            System.out.println("Confidential Doc - Extension: " + confidentialDoc.getExtension() +
//                    ", Encryption: " + confidentialDoc.getEncryption());
//        }
    }
}
