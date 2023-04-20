package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class DescontosStep {

    @Dado("^que estou no site da qazando$")
    public void que_estou_no_site_da_qazando() {
        System.out.println("passou 01");
    }

    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() {
        System.out.println("passou 02");
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {
        System.out.println("passou 03");
    }

    @Entao("^eu vejo o codigo de desconto$")
    public void eu_vejo_o_codigo_de_desconto() {
        System.out.println("passou 04");
    }
}
