import java.util.*;

class App3 {
    public static void main(String[] args) {
        ChemicalElement element1 = new ChemicalElement("Hydrogen", 1, 0.2f);
        ChemicalElement element2 = new ChemicalElement("Helium", 2, 0.4f);
        ChemicalElement element3 = new ChemicalElement("Oxygen", 4, 0.16f);
        ChemicalElement element4 = new ChemicalElement("Nitrogen", 8, 0.24f);

        TreeSet<ChemicalElement> treeSet = new TreeSet<>();
        treeSet.add(element1);
        treeSet.add(element2);
        treeSet.add(element3);
        treeSet.add(element4);

        Iterator<ChemicalElement> iter = treeSet.iterator();
        int i = 1;
        while (iter.hasNext()) {
            ChemicalElement val = iter.next();
            System.out.println(i + " = " + val);
            i++;
        }
    }
}

class ChemicalElement implements Comparable<ChemicalElement> {
    String name;
    int atomicNumber;
    float atomicWeight;

    public int compareTo(ChemicalElement o) {
        return name.compareTo(o.name);
    }

    public ChemicalElement(String name, int atomicNumber, float atomicWeight) {
        this.name = name;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    @Override
    public String toString() {
        return "ChemicalElement [name=" + name + ", atomicNumber=" + atomicNumber + ", atomicWeight=" + atomicWeight
                + "]";
    }

}