import { StyledSection } from './styles'

const Newsletter = () => {
  return ( 
    <StyledSection>
      <h3>Newsletter</h3>
      <p>Receba nossas promoções por e-mail</p>
      <form action='' method='post' >
        <input type='text' name='' id='' placeholder='Nome' />
        <input type='email' name='' id='' placeholder='E-mail' />
        <button>Cadastrar</button>
      </form>
    </StyledSection>
   )
}

export default Newsletter