
package tcp;

public class MainServidor {
    public static void main(String[] args) {
        SocketTcp server = new SocketTcp(309);
        server.start();
    }
}

 
