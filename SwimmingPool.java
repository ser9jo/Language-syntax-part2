
public class Main {
    public static void main(String[] args) {

        int volume = 1200; // 1200 litres pool volume
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int currentVolume = 0;
        int time = 0;

        while (currentVolume <= volume) {
            currentVolume = currentVolume + fillingSpeed - devastationSpeed;
            time++;
        }
        System.out.println("Заполнится за " + time + " минут");
    }
}