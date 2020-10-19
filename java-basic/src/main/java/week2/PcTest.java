package week2;

/**
 * @ClassName PcTest
 * @Description TODO
 * @Author TYTTPE
 * @Date 2020/10/19
 **/
public class PcTest {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.setSpeed(2200);

        HardDisk disk = new HardDisk();
        disk.setAmount(200);

        PC pc = new PC();
        pc.setCpu(cpu);
        pc.setHD(disk);

        System.out.println(pc.show(pc));
    }
}
