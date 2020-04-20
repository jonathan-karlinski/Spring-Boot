package karlinski.jonathan.exemploescopo.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Jonathan Karlinski
 * @since 18/04/20
 * @version 1.0
 */
@Component
@Getter @Setter
@Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)
public class ClassDAO {

    @Autowired
    private ClassJDBC objectJDBC;


}
