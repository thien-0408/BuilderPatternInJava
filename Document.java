abstract class Document {
    protected String extension;
    protected String encryption;

    public Document() {
        this.extension = "";
        this.encryption = "";
    }

    public abstract void setExtension();
    public abstract void setEncryption();
    public abstract Document buildDoc();

    public String getExtension() {
        return extension;
    }

    public String getEncryption() {
        return encryption;
    }
}