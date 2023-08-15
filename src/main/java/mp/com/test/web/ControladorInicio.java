package mp.com.test.web;


import mp.com.test.dao.PersonaDao;
import mp.com.test.servicio.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String inicio(Model model){
        var personas = personaService.listarPersonas();

        //var personas = new ArrayList<>();
        //personas.add(personas);
        //personas.add(persona2);

        //var personas = Arrays.asList(persona, persona2);

        log.info("controlador MVC");
        model.addAttribute("personas", personas);
        return "index";
    }
}
