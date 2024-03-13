import dao.ClientDaoMock;
import dao.ClienteDao;
import dao.IClientDAO;
import org.junit.Assert;
import org.junit.Test;
import service.ClienteService;

public class ClienteServiceTest {
    @Test
    public void salverTest() {
        IClientDAO mockDao = new ClientDaoMock();
        ClienteService service = new ClienteService(mockDao);


        Assert.assertEquals("Sucesso", service.salvar());
        Assert.assertEquals("Encontrado", service.buscar());
        Assert.assertEquals("Excluido", service.excluir());
        Assert.assertEquals("Atualizado", service.atualizar());
    }
    @Test(expected = UnsupportedOperationException.class)
    public void EsperaErroNosalverTest() {
        IClientDAO Dao = new ClienteDao();
        ClienteService service = new ClienteService(Dao);


        Assert.assertEquals("Sucesso", service.salvar());
        Assert.assertEquals("Encontrado", service.buscar());
        Assert.assertEquals("Excluido", service.excluir());
        Assert.assertEquals("Atualizado", service.atualizar());

    }

}
