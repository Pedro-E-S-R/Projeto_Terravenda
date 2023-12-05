import React, { useState } from 'react';
import { Form, Button } from 'react-bootstrap';
import styles from './styles.module.scss';


export function CadastroModal({ closeModal }) {
  const [username, setUsername] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [cpf, setCpf] = useState('');


  const handleLogin = () => {

    console.log('Usuário:', username, 'Senha:', password);
  
  };


  return (
    <div className={styles.modal}>
      <div className={styles.modalContent}>
        <span className={styles.close} onClick={closeModal}>&times;</span>
        <h2>Crie sua conta:</h2>
        <Form onSubmit={handleLogin}>
          <Form.Group controlId="formBasicUsername">
            <Form.Control
              type="text"
              placeholder="Digite seu usuário"
              value={username}
              onChange={(e) => setUsername(e.target.value)}
            />
            <Form.Control
              type="text"
              placeholder="Digite o seu e-mail"
              value={email}
              onChange={(e) => setUsername(e.target.value)}
            /> 
            <Form.Control
              type="text"
              placeholder="Digite seu cpf"
              value={cpf}
              onChange={(e) => setUsername(e.target.value)}
            />
            <Form.Control
              type="password"
              placeholder="Digite sua senha"
              value={password}
              onChange={(e) => setPassword(e.target.value)}
            />
          </Form.Group>

        
          <Form.Group controlId="formBasicCheckbox" className={styles.checkbox}>
            <Form.Check
              type="checkbox"
              label="Li e aceito as Condições Legais e a Política de Privacidade."
              required
              className={styles['custom-checkbox1']}
            />
            <Form.Check
           
              type="checkbox"
              label="Autorizo o Terravenda a enviar comunicações comerciais sobre produtos, serviços e eventos dos seus parceiros e colaboradores"
              required
              className={styles['custom-checkbox2']}
            />
          </Form.Group>
          

          <Button variant="primary" type="submit">
            CADASTRAR-SE
          </Button>

          <Form.Text>
            <a href="/cadastro" className={styles.link}>
              Já tem um cadastro?
            </a>
          </Form.Text>
        </Form>
      </div>
    </div>
  );

}
