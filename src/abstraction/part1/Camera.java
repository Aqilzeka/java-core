package abstraction.part1;

public class Camera extends Electronics{

    public String memoryCard = "8 GB";

    public void addMemoryCard(String memoryCard) {
            this.memoryCard = memoryCard;
    }

    public boolean hasMemoryCard() {
        return memoryCard != null && !memoryCard.trim().equals("");
    }

    @Override
    public void operate() {
        if (isOn() && hasMemoryCard()) {
            System.out.println("Click picture");
        } else if (!isOn()) {
            System.out.println("Press the power button");
        } else if (!hasMemoryCard()) {
            System.out.println("Add a memory card first");
        }
    }
}

