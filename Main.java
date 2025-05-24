import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Client client = new Client();
        Contract builder  = null;
        System.out.println("Enter contract type (Permanent, Short term, Long term)");
        String contractType = sc.nextLine().toLowerCase();
        switch (contractType){
            case "permanent":
                builder = new Permanent();
                break;
                case "short term":
                    builder = new ShortTerm();
                    break;
                    case "long term":
                        builder = new LongTerm();
                        break;
            default:
                System.out.println("Invalid contract type");
        }

        System.out.println("Enter contract ID");
        String contractID = sc.nextLine();
        System.out.println("Enter rent amount");
        double rentAmount = sc.nextDouble();
        System.out.println("Enter tenant ID");
        sc.nextLine();
        String tenantID = sc.nextLine();
        System.out.println("Enter Property ID");
        String propertyID = sc.nextLine();


        RentalContract c1 = client.requestCreateRentalContract(builder, contractID,propertyID,  tenantID, rentAmount, contractType );
        System.out.println(c1);
        //Contract builder, String contractID, String propertyID, String tenantID, double rentAmount, String contractType

    }
}