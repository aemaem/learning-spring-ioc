package mission.repository;

/**
 * @author Michael Mair
 */
//todo: #31 annotate with stereotype
public class OrderRepositoryImpl implements OrderRepository {

    @Override
    public String findById(Integer orderId) {
        return "foo";
    }
}
