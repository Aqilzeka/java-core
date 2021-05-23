package abstraction.part1;

public class Television extends Electronics {
    private String channel;

    public Television(String channel) {
        super();
        this.channel = channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

    @Override
    public void operate() {
        if (isOn() && channel != null){
            System.out.println("Playing: " + channel);
        } else if (!isOn()) {
            System.out.println("Switch on the TV");
        } else {
            System.out.println("Select channel to playB");
        }
    }
}
