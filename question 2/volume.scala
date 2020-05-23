object volume extends App{

var pi : Double = 22/7;

def calVol(rad: Double) = (4/3)*(pi)*(scala.math.pow(rad,3));

println("# Volume of the sphere with radius 5 :- " + calVol(5));

}