import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import model.Department;
import model.Seller;
import model.dao.SellerDao;
import model.dao.factory.DaoFactory;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        // TEST 1: seller findById
        System.out.println("=== TEST 1: seller findById ( ID = 3 ) =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        // TEST 2: seller findByDepartment
        System.out.println("\n=== TEST 2: seller findByDepartment ( ID = 2 ) =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        // TEST 3: seller findAll
        System.out.println("\n=== TEST 3: seller findAll =====");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        // TEST 4: seller insert
        System.out.println("\n=== TEST 4: seller insert =====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.now(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        // TEST 5: seller update
        System.out.println("\n=== TEST 5: seller update =====");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed");

        // TEST 6: seller delete
        System.out.println("\n=== TEST 6: seller delete =====");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }
}