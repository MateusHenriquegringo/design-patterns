package dio.facade.sub;

public class CrmService {
	private CrmService() {
		super();
	}
	public static void gravarCliente(String nome, String cep, String estado){
		System.out.println("cliente salvo no sistema de crm");
		System.out.println(nome);
		System.out.println(estado);
		System.out.println(cep);
	}
}
