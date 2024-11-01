package br.com.fiap.challenge3.controller;

import br.com.fiap.challenge3.mensageria.ProdutorRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class MensageriaRabbitController {

    @Autowired
    private ProdutorRabbit produtorRabbit;

    @Autowired
    private final MessageSource messageSource;

    public MensageriaRabbitController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }


    @GetMapping("/retorna_pag_msg_rabbit")
    public String retonaPagMsgRabbit(Model model) {
        return "enviar_mensagem_rabbit";
    }

    @PostMapping("/enviar_mensagem_rabbit")
    public String enviarMensagemRabbit(@RequestParam("mensagem") String msg, Model model, Locale locale) {
        produtorRabbit.enviarMensagem(msg);
        String mensagemInternacionalizada = messageSource.getMessage("mensagem.enviada", null, locale);
        model.addAttribute("mensagem",  mensagemInternacionalizada + " " + msg);
        return "enviar_mensagem_rabbit";
    }
}
