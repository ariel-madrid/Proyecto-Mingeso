package msg.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensaje")
public class Mensaje {
    
    @GetMapping
    public String imprimir()
    {
        String msg = new String("David paga la pension");
        return msg;
    }
}