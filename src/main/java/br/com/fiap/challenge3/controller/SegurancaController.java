package br.com.fiap.challenge3.controller;

import br.com.fiap.challenge3.model.Role;
import br.com.fiap.challenge3.model.Usuario;
import br.com.fiap.challenge3.repository.RoleRepository;
import br.com.fiap.challenge3.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.*;

@Controller
public class SegurancaController {

    @Autowired
    private UsuarioRepository repU;

    @Autowired
    private RoleRepository repR;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/acesso_negado")
    public ModelAndView retornaAcessoNegado() {
        return new ModelAndView("acesso_negado");
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/novo_usuario")
    public ModelAndView retornaCadUsuario(Principal principal) {
        ModelAndView mv = new ModelAndView("novo_usuario");
        mv.addObject("usuario", new Usuario());

        // Obter todas as roles
        List<Role> allRoles = repR.findAll();
        List<Role> availableRoles = new ArrayList<>();

        // Aqui você deve obter o usuario autenticado
        if (principal != null) {
            String username = principal.getName();
            Optional<Usuario> usuarioAutenticadoOpt = repU.findByUsername(username);

            if (usuarioAutenticadoOpt.isPresent()) {
                Usuario usuarioAutenticado = usuarioAutenticadoOpt.get();
                mv.addObject("usuarioAutenticado", usuarioAutenticado);

                // Lógica para determinar quais roles estão disponíveis
                if (usuarioAutenticado.getRoles().stream().anyMatch(role -> role.getNome().equals("Administrador"))) {
                    // Se o usuário autenticado for Administrador, pode selecionar todas as roles
                    availableRoles = allRoles;
                } else {
                    // Se não, apenas a role de Visualizador
                    availableRoles.add(repR.findByNome("Visualizador").orElse(null));
                }
            }
        } else {
            // Se não houver um usuário autenticado, adiciona a role de Visualizador
            availableRoles.add(repR.findByNome("Visualizador").orElse(null));
        }

        mv.addObject("roles", availableRoles);
        return mv;
    }


    @PostMapping("/inserir_usuario")
    public ModelAndView cadastrarUsuario(Usuario usuario, BindingResult bd,
                                         @RequestParam(name = "var_role") Long id_role) {

        if (bd.hasErrors()) {

            ModelAndView mv = new ModelAndView("novo_usuario");
            mv.addObject("usuario", usuario);
            mv.addObject("roles", repR.findAll());
            return mv;

        } else {

            usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));

            Set<Role> lista = new HashSet<>();

            if (id_role != null) {
                lista.add(repR.findById(id_role).orElse(null));
            }

            usuario.setRoles(lista);

            repU.save(usuario);

            return new ModelAndView("redirect:/empresas");
        }
    }
}
