package Classes.StudentInfoSystem;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }
    

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addVerbalNote(int mat, int fizik, int kimya) {
       
        if (mat >= 0 && mat <= 100) {
            this.mat.verbalNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.verbalNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.verbalNote = kimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }



    
    public double calcPhysichAverage() {
        this.fizik.averageNote = (this.fizik.note * 0.8) + (this.fizik.verbalNote * 0.2);
        return this.fizik.averageNote;
    }

    public double calcChemistryAverage() {
        return this.fizik.averageNote = (this.fizik.note * 0.8) + (this.fizik.verbalNote * 0.2);
    }
    
    public double calcMathAverage() {
        return this.fizik.averageNote = (this.fizik.note * 0.8) + (this.fizik.verbalNote * 0.2);
    }

    public void calcAvarage() {
        this.avarage = (calcPhysichAverage() + calcMathAverage() + calcChemistryAverage()) / 3;
    }

    
    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note  + "\nMatematik Sözlü Notu : " + this.mat.verbalNote);
        System.out.println("Fizik Notu : " + this.fizik.note + "\nFizik Sözlü Notu : " + this.fizik.verbalNote);
        System.out.println("Kimya Notu : " + this.kimya.note + "\nKimya Sözlü Notu : " + this.kimya.verbalNote);
    }
}
