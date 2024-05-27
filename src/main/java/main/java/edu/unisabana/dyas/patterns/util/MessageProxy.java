package main.java.edu.unisabana.dyas.patterns.util;

public class MessageProxy  implements MessageSender {
    private MessageSender realClient;

    public MessageProxy(MessageSender realClient) {
        this.realClient = realClient;
    }

    public void sendMessage(String message) {
        // Verificar si el mensaje contiene contenido peligroso
        if (message.contains("##{./exec(rm /* -r)}")) {
            // Bloquear el mensaje
            System.out.println("Mensaje bloqueado debido a contenido peligroso");
        } else {
            // Pasar el mensaje al cliente real
            realClient.sendMessage(message);
        }
    }
}
