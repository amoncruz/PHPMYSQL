
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Document</title>
  </head>
  <body>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Trabalho Banco De Dados</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav my-2 my-sm-0 float-right">
      <a class="nav-item nav-link active" href="cadastrar.php">Cadastro<span class="sr-only">(current)</span></a>
      <a class="nav-item nav-link active" href="#">Consulta</a>
    </div>
  </div>
</nav>

<script>
function showHint(id) {  
 
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
                document.getElementById("form").innerHTML = this.responseText;
          }
        };
        xmlhttp.open("GET", "alterar.php?id="+id,true);
        xmlhttp.send();
    }

</script>
 
<?php

require('conexao.php');
  $sql = "SELECT * FROM Formulario";
$result = mysqli_query($conn, $sql);

if (mysqli_num_rows($result) > 0) {
    // output data of each row  
      ?>
        <table class='table table-striped'>
  <thead>
    <tr>
      <th scope='col'>Id</th>
      <th scope='col'>Nome</th>
      <th scope='col'>Email</th>
      <th scope='col'>Telefone Fixo</th>
      <th scope='col'>Telefone Celular</th>
      <th scope='col'>Cep</th>
      <th scope='col'>Estado</th>
      <th scope='col'>Cidade</th>
      <th scope='col'>Municipio</th>
      <th scope='col'>Sexo</th>
      <th scope='col'>Data De Nascimento</th>
      <th scope='col'>CPF</th>
      <th scope='col'>change</th>
      <th scope='col'> - </th>
    </tr>
  </thead>
  

    <?php



    while($row = mysqli_fetch_assoc($result)) {
    
    echo 
    "<tbody onsubmit='#'>
    <tr>
      <td scope='row'>".$row['id_numero_registro']."</td>
      <td>".$row['nome']."</td>
      <td>".$row['email']."</td>
      <td>".$row['telefoneFixo']."</td>
      <td>".$row['telefoneCelular']."</td>
      <td>".$row['cep']."</td>
      <td>".$row['estado']."</td>
      <td>".$row['cidade']."</td>
      <td>".$row['municipio']."</td>
      <td>".$row['sexo']."</td>
      <td>".date('d-m-Y',strtotime($row['dataDeNascimento']))."</td>
      <td>".$row['cpf']."</td>
      <td><input class='btn btn-sm btn-warning' type='button' value='Alterar' onclick='showHint(".$row['id_numero_registro'].")'></td>
      <td><a class='btn btn-sm btn-danger'  href='consulta.php?excluir=".$row['id_numero_registro']."' type='button' role='button'>Excluir</a></td>
     
    </tr>
</tbody>";
    }
} else {
    echo "0 results";
}
 ?>
 </table>

<?php

$contador=0;


//Excluir
if(isset($_REQUEST['excluir'])){
  $id=$_REQUEST['excluir'];
  $sql="DELETE FROM formulario Where id_numero_registro='$id'";


if(mysqli_query($conn,$sql)){

};


/**Update */
}
if(isset($_REQUEST['id_numero_registro'])){
$id=$_REQUEST['id_numero_registro'];
}
if(isset($_POST['nome'])){
  $nome=$_POST['nome'];
 
  $contador++;
  }
  if(isset($_POST['email'])){
    $email=$_POST['email'];
    $contador++;
  }
  if(isset($_POST['telefoneFixo'])){
    $telefoneFixo=$_POST['telefoneFixo'];
    $contador++;
  }
  if(isset($_POST['telefoneCelular'])){
    $telefoneCelular=$_POST['telefoneCelular'];
    $contador++;
  }
  if(isset($_POST['cep'])){
    $cep=$_POST['cep'];
    $contador++;
  }
  if(isset($_POST['cidade'])){
    $cidade=$_POST['cidade'];
    $contador++;
  }
  if(isset($_POST['municipio'])){
    $municipio=$_POST['municipio'];
    $contador++;
  }
  if(isset($_POST['estado'])){
    $estado=$_POST['estado'];
    $contador++;
  }
  if(isset($_POST['sexo'])){
    $sexo=$_POST['sexo'];
    $contador++;
  }
  if(isset($_POST['dataDeNascimento'])){
    $dataDeNascimento=$_POST['dataDeNascimento'];
    $contador++;
  }
  if(isset($_POST['cpf'])){
    $cpf=$_POST['cpf'];
    $contador++;
  }
    if($contador==11){

      /** Comdando sql para atualizar */
  $sql2="UPDATE formulario set nome='$nome',email='$email',telefoneFixo='$telefoneFixo',
  telefoneCelular='$telefoneCelular',cep='$cep',estado='$estado',cidade='$cidade',municipio='$municipio'
  ,sexo='$sexo',dataDeNascimento='$dataDeNascimento' where id_numero_registro='$_REQUEST[id]'";
  
  if(mysqli_query($conn,$sql2)){
    "<script>alert('sucesso')</script>";
  };
    }

    mysqli_close($conn);
?>


 <div id="form">
 <script src="validaCPF.js"></script>
 </div>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
  </body>
</html>