
import FormCard from 'components/FormCard';
import { useParams } from 'react-router-dom';

function Form() {

  const parans = useParams();

  return (
    <FormCard movieId={`${parans.movieId}`}/>
  );
}

export default Form;
