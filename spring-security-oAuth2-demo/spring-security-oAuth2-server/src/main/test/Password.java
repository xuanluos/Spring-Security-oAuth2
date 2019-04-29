import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author xuanLuos
 * @date 2019/4/27 15:14
 */
public class Password {


    @Test
    public void password() {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
