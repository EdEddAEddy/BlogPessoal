package com.generation.blogpessoal.security;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.generation.blogpessoal.model.Usuario;

public class UserDetailsImpl implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	private List<GrantedAuthority> authorities;
	
	public userDetailsImpl(Usuario user) {
		this.userName = user.getUsuario();
		this.password = user.getSenha(); 
	}
	
	public userDetailsImpl() {}
}
