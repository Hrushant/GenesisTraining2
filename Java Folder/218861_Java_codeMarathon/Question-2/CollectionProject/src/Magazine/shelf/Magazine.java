package Magazine.shelf;

//Create class Magazine
public class Magazine {
    int magazineNumber;
    String magazineName;
    String magazineAuthor;
    int magazineTotalNumberOfPages;
    double magazinePrice;

    // Using hashcode() and equals() methods
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + magazineNumber;
        result = prime * result + ((magazineName == null) ? 0 : magazineName.hashCode());
        result = prime * result + ((magazineAuthor == null) ? 0 : magazineAuthor.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Magazine other = (Magazine) obj;
        if (magazineNumber != other.magazineNumber)
            return false;
        if (magazineName == null) {
            if (other.magazineName != null)
                return false;
        } else if (!magazineName.equals(other.magazineName))
            return false;
        if (magazineAuthor == null) {
            if (other.magazineAuthor != null)
                return false;
        } else if (!magazineAuthor.equals(other.magazineAuthor))
            return false;
        return true;
    }

    // making constructor
    public Magazine(int magazineNumber, String magazineName, String magazineAuthor, int magazineTotalNumberOfPages,
            double magazinePrice) {
        this.magazineNumber = magazineNumber;
        this.magazineName = magazineName;
        this.magazineAuthor = magazineAuthor;
        this.magazineTotalNumberOfPages = magazineTotalNumberOfPages;
        this.magazinePrice = magazinePrice;
    }

    @Override
    public String toString() {
        return "Magazine [magazineNumber=" + magazineNumber + ", magazineName=" + magazineName + ", magazineAuthor="
                + magazineAuthor + ", magazineTotalNumberOfPages=" + magazineTotalNumberOfPages + ", magazinePrice="
                + magazinePrice + "]";
    }
}