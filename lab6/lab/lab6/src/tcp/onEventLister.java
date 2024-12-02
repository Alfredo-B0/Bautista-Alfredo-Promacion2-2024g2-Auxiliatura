package tcp;

public interface onEventLister {
    public void join(String channelName, ServerClientSocket client);
}
