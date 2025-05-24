class Client {
    public RentalContract requestCreateRentalContract(Contract builder, String contractID, String propertyID, String tenantID, double rentAmount, String contractType) {
        builder.BuildContractID(contractID);
        builder.BuildPropertyID(propertyID);
        builder.BuildTenantID(tenantID);
        builder.BuildRentAmount(rentAmount);
        return builder.SignContract(contractType);
    }
    public Document newDocument(String documentType) {
        Document document = null;

        if (documentType.equalsIgnoreCase("normal")) {
            document = new NormalDoc();
        } else if (documentType.equalsIgnoreCase("confidential")) {
            document = new ConfidentialDoc();
        } else {
            System.out.println("Unknown document type: " + documentType);
            return null;
        }

        return document.buildDoc();
    }
}