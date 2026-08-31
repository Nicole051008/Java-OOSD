public class FtpRequest extends Request {

    private static final short PORT = 21;


    // Constructor for FtpRequest class
    public FtpRequest(String address, String file) {
        super(address, file);
    }

    @Override
    public short getPort() {
        return PORT;
    }

    @Override
    public String getFullRequest() {
        return String.format("RETR %s\r\n", super.file);
    }
}
