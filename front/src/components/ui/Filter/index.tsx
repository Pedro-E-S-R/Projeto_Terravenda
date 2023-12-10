import { Form, Button } from 'react-bootstrap';
import styles from './styles.module.scss';


export function Filter() {
 

  return (

    <div className={styles['filter-conteiner']}>
      <div className={styles.divh1}></div>
      <div >
        <h1>Preferências:</h1>
      </div>
      <div className={styles.divisoria}></div>
      <div>
        <Form.Group controlId="formBasicCheckbox" className={styles.checkbox}>
            <Form.Check
              type="checkbox"
              label="A venda"
              required
              className={styles['custom-checkbox']}
            />
            <Form.Check
           
              type="checkbox"
              label="Aluguel"
              required
              className={styles['custom-checkbox']}
            />
          </Form.Group>
          
        </div>
        <div className={styles.divisoria}></div>
        <div>
          <h1>Preço:</h1>

          <h5>Mínimo: <br/>
              R$ 0,00
          </h5>
          <input className={styles.inputvalor}></input>
          <h5>Maxímo: <br/>
              R$ 999.999.999,99
          </h5>
          <input className={styles.inputvalor}></input>
        </div>

    </div>
    
  );
}


