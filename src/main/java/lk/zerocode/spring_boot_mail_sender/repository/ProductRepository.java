package lk.zerocode.spring_boot_mail_sender.repository;

import lk.zerocode.spring_boot_mail_sender.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
