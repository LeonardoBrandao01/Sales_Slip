package View;

import Model.Product;

import javax.swing.text.View;
import java.util.List;

public class ViewBill {
    public void displayItems(List<Product> products) {
        double totalSales = 0;
        System.out.println("Produto | Quantidade | Preço Unitário | Preço Total");
        for (Product product : products) {
            double itemTotal = product.getPrice() * product.getQuantity();
            System.out.printf("%s | %d | %.2f | %.2f\n",
                    product.getName(), product.getQuantity(), product.getPrice(), itemTotal);
            totalSales += itemTotal;
        }
        System.out.printf("Valor Total da Venda: %.2f\n", totalSales);
    }
}
