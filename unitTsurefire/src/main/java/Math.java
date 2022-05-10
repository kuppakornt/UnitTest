
class Math{
    double getVolume(double w,double h ,double l){
        double volume = w*h*l;
    return volume;
    }
    double setReduceVolume20(double v){
    return v*0.80;
    }
    double setGainVolume15(double v){
    return v*1.15;
    }
    double setRectangularVolume(double w,double h,double l){
        double lr=l*2;
        double volume =w*h*lr;
        return volume;
    }
}
