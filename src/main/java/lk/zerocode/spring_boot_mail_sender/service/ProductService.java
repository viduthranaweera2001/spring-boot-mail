package lk.zerocode.spring_boot_mail_sender.service;

import lk.zerocode.spring_boot_mail_sender.model.Product;
import lk.zerocode.spring_boot_mail_sender.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;
    private JavaMailSender mailSender;

    public Product saveProduct(Product product) {
        Product savedProduct = productRepository.save(product);
        sendProductEmail(savedProduct);
        return savedProduct;
    }

    private void sendProductEmail(Product product) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("viduthranaweera1234@gmail.com");
        message.setSubject("New Product Added");
        message.setText("A new product has been added:\n\n" +
                "Name: " + product.getName() + "\n" +
                "Description: " + product.getDescription() + "\n" +
                "Price: Rs." + product.getPrice());

        mailSender.send(message);
    }
}