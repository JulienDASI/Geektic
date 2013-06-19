package julien.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.BeforeClass;

import com.iut.julien.GeekDAO;

import junit.framework.TestCase;

public class GeekTest extends TestCase {

	public GeekDAO geekDao;
	
	private EntityManager entityManager;
	private static EntityManagerFactory entityManagerFactory;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	entityManagerFactory = Persistence
	.createEntityManagerFactory("GEEKTIC");
	}
	
}