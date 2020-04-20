package karlinski.jonathan.exemplohelloworld.controller;

import karlinski.jonathan.exemplohelloworld.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jonathan Karlinski
 * @since 15/04/20
 * @version 1.0
 */
@RestController
public class ProdutoController {

    @GetMapping("/produtos")
    public String getProducts() {
        return "Área dos produtos";
    }

    @GetMapping("/produto")
    public Produto getProduct() {
        Produto produto = new Produto();
        produto.setDescricao("Descrição do produto");
        return produto;
    }
}
