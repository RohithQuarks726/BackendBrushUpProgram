public class InheritanceApplication {
    public static void main(String[] args){
        Cube cube=new Cube("Rohith");
        cube.setName();
        Cuboid cuboid=new Cuboid("Sahana");
        cuboid.setName();
        Cone cone=new Cone("Thanu");
        cone.setName();
        Sphere sphere=new Sphere("Riya");
        sphere.setName();

        cube.print();
        cuboid.print();
        cone.print();
        sphere.print();
    }
}
class Shapes{
    String name;
//    private String shape;
     Shapes (String name){
        this.name=name;
     }
     String getName(){
         return name;
     }
     void setName(){
         this.name=name;
     }
     void shape(){
         System.out.println(name+ " is an unidentified 3D shape.");
     }
     void print(){
         System.out.println("*");
     }
     void print(String shape){
         if(shape=="cube"){
             for (int i=0; i<5; i++){
                 for(int j=0; j<5; j++){
                     if(i==0 || j==0 || i==4 || j==4) {
                         System.out.print("\u001B[31m" + "*" + "\u001B[31m");
                     }else{
                         System.out.print(" ");
                     }
                 }
                 System.out.println("\n");
             }
         } else if(shape=="cuboid"){
             for(int i=0; i<5;i++) {
                 for(int j=0; j<10; j++) {
                     if (i==0 || j==0 || i==4 || j==9) {
                         System.out.print("\u001B[32m" + "*" + "\u001B[32m");
                     }else {
                         System.out.print(" ");
                     }
                 }
                 System.out.println("");
             }
             System.out.println("\n");
         } else if (shape=="cone"){
             for(int i=0; i<5; i++){
                 for(int j=0; j<9; j++){
                     if(i+j==4||j-i==4||i==4) {
                         System.out.print("\u001B[34m"+"*"+"\u001B[34m");
                     }else {
                         System.out.print(" ");
                     }
                 }
                 System.out.println();
             }
             System.out.println("\n");
         } else if(shape=="sphere"){
             for (int y = -3; y <= 3; y++) {
                 for (int x = -3; x <= 3; x++) {
                     if (x * x + y * y <= 3 * 3) {
                         System.out.print("\u001B[33m"+"* "+"\u001B[33m");
                     } else {
                         System.out.print("  ");
                     }
                 }
                 System.out.println();
             }
             System.out.println("\n");
         }
     }
}
class EdgeBased extends Shapes{
    EdgeBased(String name) {
        super(name);
    }
    void element(){
        System.out.println(name+" have edges all around.");
    }
}
class CurveBased extends Shapes{
    CurveBased(String name){
        super(name);
    }
    void element(){
        System.out.println(name+" is a curvy figure.");
    }
}
class Cube extends EdgeBased{
    Cube(String name){
        super(name);
    }
    void faces(){
        System.out.println(name+" has six faces all of equal area.");
    }
    @Override
    void print(){
        for (int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i==0 || j==0 || i==4 || j==4) {
                    System.out.print("\u001B[31m" + "*" + "\u001B[31m");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }
}
class Cuboid extends EdgeBased{
    Cuboid(String name){
        super(name);
    }
    void faces(){
        System.out.println(name+" has six faces with three pairs of equal area.");
    }
    @Override
    void print(){
        for(int i=0; i<5;i++) {
            for(int j=0; j<10; j++) {
                if (i==0 || j==0 || i==4 || j==9) {
                    System.out.print("\u001B[32m" + "*" + "\u001B[32m");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
class Sphere extends CurveBased{
    Sphere(String name){
        super(name);
    }
    void looks(){
        System.out.println(name+" is just a shiny object that looks the same from all sides.");
    }
    @Override
    void print(){
        for (int y = -3; y <= 3; y++) {
            for (int x = -3; x <= 3; x++) {
                if (x * x + y * y <= 3 * 3) {
                    System.out.print("\u001B[33m"+"* "+"\u001B[33m");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
class Cone extends CurveBased{
    Cone(String name){
        super(name);
    }
    void looks(){
        System.out.println(name+" looks like a circle from bottom and triangle from side.");
    }
    @Override
    void print(){
        for(int i=0; i<5; i++){
            for(int j=0; j<9; j++){
                if(i+j==4||j-i==4||i==4) {
                    System.out.print("\u001B[34m"+"*"+"\u001B[34m");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
//class RubiksCube extends Cube{
//    RubiksCube(String name){
//        super(name);
//    }
//    void uses(){
//        System.out.println(name+" is a fun and brainstorming cube made of 26 smaller cubes.");
//    }
//}
//class PackageBoxes extends Cube{
//    PackageBoxes(String name){
//        super(name);
//    }
//    void uses(){
//        System.out.println(name+" are big hollow cubes to put stuff you want to move elsewhere.");
//    }
//}
//class Suitcase extends Cuboid{
//    Suitcase(String name){
//        super(name);
//    }
//    void uses(){
//        System.out.println(name+" is a hollow cuboid to pack your clothes compactly for travel.");
//    }
//}
//class Mattress extends Cuboid{
//    Mattress(String name){
//        super(name);
//    }
//    void uses(){
//        System.out.println(name+ " is a big flat cuboid filled with soft stuff that you sleep on.");
//    }
//}
//class GasCylinders extends Cylinder{
//    GasCylinders(String name){
//        super(name);
//    }
//    void uses(){
//        System.out.println(name+" are heavy metallic cylinders that contains inflammable gas.");
//    }
//}
//class FireExtinguishers extends Cylinder{
//    FireExtinguishers(String name){
//        super(name);
//    }
//    void uses(){
//        System.out.println(name+" are metallic cylinders that have either powder or gas that could suppress and cease fires.");
//    }
//}
//class Balls extends Sphere{
//    Balls(String name){
//        super(name);
//    }
//    void uses(){
//        System.out.println(name+" are spheres filled with air with which most sports are played.");
//    }
//}
//class Bowls extends Sphere{
//    Bowls(String name){
//        super(name);
//    }
//    void uses(){
//        System.out.println(name+" are hollow half spheres in which you put cereal, pour a glass of milk and sit in from of the tv every morning.");
//    }
//}