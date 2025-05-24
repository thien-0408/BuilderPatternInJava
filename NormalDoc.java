class NormalDoc extends Document {

    @Override
    public void setExtension() {
        this.extension = ".txt";
    }

    @Override
    public void setEncryption() {
        this.encryption = "None"; // No encryption for normal documents
    }

    @Override
    public Document buildDoc() {
        setExtension();
        setEncryption();
        System.out.println("Normal Document created:");
        System.out.println("- Extension: " + this.extension);
        System.out.println("- Encryption: " + this.encryption);
        return this;
    }
}