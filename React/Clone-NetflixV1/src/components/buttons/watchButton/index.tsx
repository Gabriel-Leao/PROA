import { IButton } from "../../../interfaces"
import PlayButton from "./styles"

const WatchButton = ({ href, children }: IButton) => {
  return (
    <PlayButton href={href}> {children} </PlayButton>
  )
}

export default WatchButton