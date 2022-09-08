import logo from '../../assets/img/logo.gif'
import './styles.css'

function Header() {
  return (
    <header>
      <div className="dsmeta-logo-container">
        <img src={logo} alt="DSMeta" />
        <h1>Meta Vendas</h1>
        <p>
          Desenvolvido por
          <a href="https://github.com/JuniorBI"> Antonio Junior</a>
        </p>
      </div>
    </header>
  );
}

export default Header;
