import { StyledHeader, StyledLogo, StyledUser } from "./styles"

interface IHeader {
  black: Boolean
}

const Header = ({ black }: IHeader) => {

  return (
    <StyledHeader className={black ? 'black' : ''}>
      <StyledLogo>
        <a href="/">
          <img src="/Netflix_Logo.png" alt="Logo Netflix" />
        </a>
      </StyledLogo>

      <StyledUser>
        <a href="/">
          <img src="/Netflix_Avatar.png" alt="Usuário" />
        </a>
      </StyledUser>
    </StyledHeader>
  )
}

export default Header