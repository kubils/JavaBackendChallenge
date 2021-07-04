package com.company;

import java.util.*;

public class StartStore {

    public StartStore() {
    }

    public void start() {
        int select;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("PatikaStore Ürün Yönetim Paneli !\n");
            System.out.println("1-Notebook İşlemleri\n2-Cep Telefonu İşlemleri\n3-Marka Listele\n0-Çıkış Yap");
            try {
                System.out.print("Tercihiniz : ");
                select = scan.nextInt();
                app(select);

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println();
        }

    }

    public void app(int select) {
        switch (select) {
            case 1:
                showNotebook();
                break;
            case 2:
                showPhone();
                break;
            case 3:
                printBrandList();
                break;
            case 0:
                System.exit(1);
            default:
                System.out.println("Geçerli bir değer giriniz!!!");
        }

    }

    public void printBrandList() {
        Set<Brand> brandList = new TreeSet<>(new BrandCompare());
        brandList.add(new Brand(1, "Samsung"));
        brandList.add(new Brand(2, "Lenovo"));
        brandList.add(new Brand(3, "Huawei"));
        brandList.add(new Brand(4, "Casper"));
        brandList.add(new Brand(5, "Asus"));
        brandList.add(new Brand(6, "HP"));
        brandList.add(new Brand(7, "Xiaomi"));
        brandList.add(new Brand(8, "Monster"));

        System.out.println("Markalarımız\n-------------");
        for (Brand b : brandList) {
            System.out.println("- " + b.getName());
        }
    }

    public void showNotebook() {

        Set<Notebook> notebooks = new LinkedHashSet<>();

        notebooks.add(new Notebook(1, "Huawei", 7000, 0.5,
                22, "HUAWEI Matebook 14", 16, 512, 14));

        notebooks.add(new Notebook(2, "Lenovo", 3699, 0.5,
                22, "LENOVO V14 IGL", 8, 1024, 14));

        notebooks.add(new Notebook(3, "Asus", 8199, 0.5,
                22, "HUAWEI Matebook 14", 32, 2048, 15.6));
        printNotebook(notebooks);
    }

    public void printNotebook(Set<Notebook> notebooks) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.printf("| %2s | %20s | %7s | %10s | %10s | %5s | %5s ", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Ram");
        System.out.println("\n-------------------------------------------------------------------------------------------");
        for (Notebook notebook : notebooks) {

            System.out.printf("| %2s | %20s | %7s | %10s | %10s | %5s | %5s ",
                    notebook.getId(), notebook.getModel(), notebook.getPrice(), notebook.getName(), notebook.getDiskCapacity(), notebook.getScreenSize(), notebook.getMemory());
            System.out.println();
        }
    }

    public void showPhone() {
        Set<Phone> phones = new LinkedHashSet<>();


        phones.add(new Phone(1, "Samsung", 3199.0, 0.5,
                22, "SAMSUNG GALAXY A51", 128, 6.5, 4000, 6, "Siyah"));

        phones.add(new Phone(2, "Apple", 7379.0, 0.5,
                22, "iPhone 11 64 GB", 64, 6.1, 3046, 6, "Mavi"));

        phones.add(new Phone(3, "Xiaomi", 4012.0, 0.5,
                22, "Redmi Note 10 Pro 8GB", 128, 6.1, 4000, 12, "Beyaz"));
        printPhone(phones);
    }

    public void printPhone(Set<Phone> notebooks) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.printf("| %2s | %20s | %7s | %10s | %10s | %5s | %5s | %5s | %5s", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Ram", "Pil", "Renk");
        System.out.println("\n-------------------------------------------------------------------------------------------");
        for (Phone notebook : notebooks) {

            System.out.printf("| %2s | %20s | %7s | %10s | %10s | %5s | %5s | %5s | %5s ",
                    notebook.getId(), notebook.getModel(), notebook.getPrice()
                    , notebook.getName(), notebook.getMemory()
                    , notebook.getScreenSize(), notebook.getMemory()
                    , notebook.getBattery(), notebook.getColor());
            System.out.println();
        }
    }
}
