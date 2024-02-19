package metier;

import org.example.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    @Autowired
    private IDao dao ;
    @Override
    public double calcul() {
        double temp = dao.getData();
        double res=temp+32; //c to fahrenheit
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

}
