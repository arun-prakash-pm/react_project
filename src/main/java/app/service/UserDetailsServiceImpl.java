package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.model.PanelUser;
import app.repository.PanelUserRepository;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	PanelUserRepository panelUserRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		PanelUser panelUser=panelUserRepository.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("User Not Found with username: " + username));
		return UserDetailsImpl.build(panelUser);
	}

}
