
@RequestMapping("/middleware")
@RestController
public class InterceptorController {

    @RestritoPessoaAdministradora
    @GetMapping("/com-interceptor")
    public void com() {
    }


    @GetMapping("/sem-interceptor")
    public void sem() {
    }
}