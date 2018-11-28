<html>
  <body>
<?php

require ('conexao.php');
$contador=0;
$id=$_REQUEST['id'];


$sql="SELECT * FROM formulario Where id_numero_registro=".$id."";

$result = mysqli_query($conn,$sql);

$row = mysqli_fetch_assoc($result);
  echo "blz".$row['id_numero_registro'];

echo "<div class='container'>
<form action='consulta.php?id=".$row['id_numero_registro']."' method='POST' name='formulario' onsubmit='VerificaCPFp1();' >
<div class='col-8'>
<label for='nome'>Nome</label>
<input type='text' class='form-control' id='nome' name='nome' value='".$row['nome']."' required >
</div>

<div class='col-md-8'>
<label for='email'>Email</label>
<input type='email'  id='email' name='email' class='form-control' value='".$row['email']."' required>
</div>
<div class='form-row'>
<div class='col-md-3 ml-3'>
<label for='telefoneFixo'>Telefone Fixo</label>
<input type='text' name='telefoneFixo' class='form-control' value='".$row['telefoneFixo']."' required>
</div>
<div class='col-md-3 ml-3'>
<label for='telefoneCelular'>Telefone Celular</label>
<input type='text' name='telefoneCelular' class='form-control' value='".$row['telefoneCelular']."'>
</div>
</div>
<div class='form-row'>
<div class='col-md-3 ml-3'>
<label for='cep'> Cep</label>
<input type='text' name='cep' class='form-control' value='".$row['cep']."' required>
</div>
<div class='col-md-2 ml-3'>
<label for='estado'>Estado</label>
<input type='text' name='estado'  class='form-control' value='".$row['estado']."' required>
</div>
<div class='col-md-2 ml-3'>
<label for='cidade'> Cidade</label>
<input type='text' name='cidade' class='form-control' value='".$row['cidade']."' required>
</div>
</div>
<div class='col-md-8' >
<label for='municipio'>Municipio</label>
<input type='text' name='municipio' class='form-control' value='".$row['municipio']."' required>
</div>
<div class='col-md-8'>
<label for='sexo'>Sexo</label><br>
<input type='radio' name='sexo' value='masculino' required>Masculino
<input type='radio' name='sexo' value='feminino'>Feminino
</div>
<div class='col-md-8'>
<label for='dataDeNascimento'>Data de Nascimento</label>
<input type='date' name='dataDeNascimento' class='form-control' value='".$row['dataDeNascimento']."' required>
</div>
<div class='col-md-8'>
<label for='cpf'> Cpf:</label>
<input type='text' name='cpf' class='form-control' value='".$row['cpf']."' required>
</div>
<div class='ml-3'>
<input class='btn btn-primary mt-2' type='button' value='Enviar' onclick='VerificaCPFp1();'>
</div>
  </form>
  </div>";

 
?>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
 
<script type="text/javascript" src="js/mask.js"></script>
      <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.min.js"></script>
      <script type="text/javascript" src="js/jquery.maskedinput.js"></script>
   

    
  </body>
</html>
