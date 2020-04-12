import java.util.Scanner;
import java.lang.Math;
class AcTonCalculator {
    double width;
    double length;
    double height;


    double VolumeCalculator() {
        Scanner input = new Scanner(System.in);
        width = input.nextDouble();
        length = input.nextDouble();
        height = input.nextDouble();
        //Checking : System.out.printf(" %f  %f  %f",width,length,height);
        return width*length*height;
    }

    void CoolingCapacity(double t) {
        double ton;
        //System.out.printf("T = %f\n",t);
        //ton = pow(t/10, (1/3));
        ton=Math.cbrt(t);

        System.out.printf("You need an AC of %f ton", ton);

    }
}


class ACDemo{
    public static void main(String args[]) {
        double vol;
        AcTonCalculator AkifAC = new AcTonCalculator();
        vol=AkifAC.VolumeCalculator();
        AkifAC.CoolingCapacity(vol);

    }
}

