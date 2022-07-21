import reflection.api.Investigator;

public class Main {
    public static void main(String[] args) {
        Investigator hj=new invest();
        Rectangle rectangle = new Rectangle(4,6);
        hj.load(rectangle);
        System.out.println(hj.getTotalNumberOfFields());
        System.out.println(hj.getTotalNumberOfMethods());
        System.out.println(hj.getCountOfConstantFields());
        System.out.println(hj.getTotalNumberOfConstructors());
        System.out.println(hj.isExtending());
        System.out.println(hj.getParentClassSimpleName());
        System.out.println(hj.isParentClassAbstract());
    }
}
