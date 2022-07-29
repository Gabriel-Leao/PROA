import { IButton } from '../../../interfaces'
import MyListButton from './styles'

const AddToListButton = ({ href, children }: IButton) => {
  return (
    <MyListButton href={href}> {children} </MyListButton>
  )
}

export default AddToListButton