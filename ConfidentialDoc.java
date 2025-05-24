class ConfidentialDoc extends Document {

    @Override
    public void setExtension() {
        this.extension = ".zip";
    }

    @Override
    public void setEncryption() {
        this.encryption = "AES";
    }

    @Override
    public Document buildDoc() {
        setExtension();
        setEncryption();
        System.out.println("Confidential Document created:");
        System.out.println("- Extension: " + this.extension);
        System.out.println("- Encryption: " + this.encryption);
        return this;
    }
}