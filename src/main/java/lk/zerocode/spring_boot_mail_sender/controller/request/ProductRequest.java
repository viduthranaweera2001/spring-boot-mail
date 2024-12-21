package lk.zerocode.spring_boot_mail_sender.controller.request;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private String description;
    private double price;
}
