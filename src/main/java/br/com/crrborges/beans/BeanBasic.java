package br.com.crrborges.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "beanBasic")
public class BeanBasic {

	
	
	public String teste;

	public BeanBasic() 					{							}
	public String getTeste() 			{return teste;				}
	public void setTeste(String teste) 	{this.teste = teste;		}
	
	public String testaBean () {
		System.out.println("recebi da pagina o valor de "+this.getTeste());
		return "";
	}
	
}
