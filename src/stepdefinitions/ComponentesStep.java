package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Então;
import util.ComponentsComponentesStep;

public class ComponentesStep {

    ComponentsComponentesStep componentsComponentesStep = new ComponentsComponentesStep();

    // Validar campo textfield e textarea

    @Dado("que o usuário acessou o arquivo Campo de Treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_Treinamento() {
        componentsComponentesStep.inicializa();
        componentsComponentesStep.acessarCampoDeTreinamento();
    }

    @Quando("o usuário digitar Batatinha")
    public void o_usuário_digitar_Batatinha() {
        componentsComponentesStep.testTextField();
    }

    @Então("no campo textfield deve apresentar a palavra Batatinha")
    public void no_campo_textfield_deve_apresentar_a_palavra_Batatinha() {
        componentsComponentesStep.validateTextField();
        componentsComponentesStep.encerraBrowser();
    }

    @Quando("o usuário digitar Batatinha Batatinha")
    public void o_usuário_digitar_Batatinha_Batatinha() {
        componentsComponentesStep.testTextArea();
    }

    @Então("no campo textarea deve apresentar a palavra Batatinha Batatinha")
    public void no_campo_textarea_deve_apresentar_a_palavra_Batatinha_Batatinha() {
        componentsComponentesStep.validateTextArea();
        componentsComponentesStep.encerraBrowser();
    }

    // Validar elementos radio button

    @Quando("o usuário clicar no elemento radio button")
    public void o_usuário_clicar_no_elemento_radio_button() {
        componentsComponentesStep.testRadioButton();
    }

    @Então("o elemento radio button deve aparecer selecionado")
    public void o_elemento_radio_button_deve_aparecer_selecionado() {
        componentsComponentesStep.validateRadioButton();
        componentsComponentesStep.encerraBrowser();
    }

    @Quando("o usuário clicar no elemento checkbox")
    public void o_usuário_clicar_no_elemento_checkbox() {
        componentsComponentesStep.testCheckbox();
    }

    @Então("o elemento checkbox deve aparecer selecionado")
    public void o_elemento_checkbox_deve_aparecer_selecionado() {
        componentsComponentesStep.validateChckbox();
        componentsComponentesStep.encerraBrowser();
    }
}
