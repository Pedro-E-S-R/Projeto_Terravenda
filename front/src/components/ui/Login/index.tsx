import React, { useState } from 'react';
import styles from './styles.module.scss';


export function LoginModal({ closeModal }) {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');


  const handleLogin = () => {

    console.log('Usuário:', username, 'Senha:', password);
  
  };


  return (
    <div className={styles.modal}>
      <div className={styles.modalContent}>
        <span className={styles.close} onClick={closeModal}>&times;</span>
       
        <h2>Login</h2>
        <form onSubmit={handleLogin}>
          <input
            type="text"
            placeholder="Usuário"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
          />
          <input
            type="password"
            placeholder="Senha"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
          <button type="submit">Entrar</button>
          <a href="/cadastro" className={styles.link}>Não tem um cadastro?</a>
        </form>
      </div>
    </div>
  );
}
