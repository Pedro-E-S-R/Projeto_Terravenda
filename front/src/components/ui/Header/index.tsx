import { useEffect, useState } from 'react';
import Select from 'react-select';
import styles from './styles.module.scss';
import { IoPersonCircle } from "react-icons/io5";
import { LoginModal } from '../Login';
import { CadastroModal } from '../Cadastro';

const customStyles = {
  control: (provided) => ({
    ...provided,
    backgroundColor: '#D9D9D9',
    border: 'none',
    color: '#878585',
    width: '14vw'
   
  }),
  singleValue: (provided) => ({
    ...provided,
    color: '#878585'
  })
};

export function Header() {
  const [cities, setCities] = useState([]);
  const [showLoginModal, setShowLoginModal] = useState(false);
  const [showCadastroModal, setShowCadastroModal] = useState(false);


  useEffect(() => {
    async function fetchCities() {
      try {
        const response = await fetch(ibge);
        if (!response.ok) {
          throw new Error('Falha ao carregar os dados das cidades');
        }
        const data = await response.json();
        const options = data.map(city => ({
          value: city.id,
          label: `${city.nome}, ${city.microrregiao.mesorregiao.UF.sigla}`
        }));
        setCities(options);
      } catch (error) {
        console.error('Erro ao carregar as cidades:', error);
      }
    }

    fetchCities();
  }, []);

  const openLoginModal = () => {
    setShowLoginModal(true);
    setShowCadastroModal(false); // Garante que o outro modal seja fechado ao abrir este
  };

  const openCadastroModal = () => {
    setShowCadastroModal(true);
    setShowLoginModal(false); // Garante que o outro modal seja fechado ao abrir este
  };

  const closeModals = () => {
    setShowLoginModal(false);
    setShowCadastroModal(false);
  };

  const handleLoginLinkClick = (event) => {
    event.preventDefault();
    openLoginModal();
  };

  const handleCadastroLinkClick = (event) => {
    event.preventDefault();
    openCadastroModal();
  };
  return (
    <header className={styles.headerContainer}>
    <div className={styles.headerContent}>
      {/* Seu conteúdo existente */}
      <img className={styles.imag} src="/terravenda_verdeclaro.png" width={120} height={120} />
      <img className={styles.image} src="/nome.png" width={400} height={400} />
      <div className={styles['input-container']}>
        <input type="text" placeholder="Digite algo..." />
        <Select
          className={styles.selector}
          placeholder="Selecione a cidade"
          options={cities}
          isSearchable={true}
          styles={customStyles}
        />
        <button>Buscar</button>
      </div>
      <div className={styles['login-container']}>
        <p>
          Faça <a href="#" className={styles.link} onClick={handleLoginLinkClick}><strong>LOGIN</strong></a> ou crie seu
          <a href="#" className={styles.link} onClick={handleCadastroLinkClick}><strong> CADASTRO</strong></a>
        </p>
        <div className={styles['icon-container']}>
          <IoPersonCircle className={styles.icon} />
        </div>
      </div>
    </div>

   
    {showLoginModal && <LoginModal closeModal={closeModals} />}
    {showCadastroModal && <CadastroModal closeModal={closeModals} />}
  </header>
  );
}

const ibge = 'https://servicodados.ibge.gov.br/api/v1/localidades/municipios';
