package week2;

/**
 * @ClassName PC
 * @Description TODO
 * @Author TYTTPE
 * @Date 2020/10/19
 **/
public class PC {
    CPU cpu;
    HardDisk HD;

    public void setCpu(CPU c){
        this.cpu = c;
    }

    public void setHD(HardDisk h){
        this.HD = h;
    }

    public String show(PC pc){
        return "CPU速度:" + pc.cpu.getSpeed() + ",HD容量：" + pc.HD.getAmount();
    }
}
