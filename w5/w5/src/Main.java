public class Main {

    public static void main(String[] args) {

        HttpRequest httpRequest = new HttpRequest(
                "www.example.com",
                "/index.html",
                "GET"
        );

        FtpRequest ftpRequest = new FtpRequest(
                "ftp.example.com",
                "/files/example.txt"
        );

        System.out.println("HTTP Request");
        System.out.println("Address: " + httpRequest.getAddress());
        System.out.println("Port: " + httpRequest.getPort());
        System.out.println("Full request: " + httpRequest.getFullRequest());

        System.out.println();

        System.out.println("FTP Request");
        System.out.println("Address: " + ftpRequest.getAddress());
        System.out.println("Port: " + ftpRequest.getPort());
        System.out.println("Full request: " + ftpRequest.getFullRequest());
    }
}