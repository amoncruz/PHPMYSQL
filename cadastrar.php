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
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup" >
    <div class="navbar-nav">
      <a class="nav-item nav-link " href="#">Cadastro<span class="sr-only">(current)</span></a>
      <a class="nav-item nav-link " href="consulta.php">Consulta</a>
    </div>
  </div>
</nav>

<div class="container">
<form  method="POST" action="#" name="formulario" onsubmit="VerficaCPFp1();">
<div class="col-10">
<label for="nome">Nome:</label>
<input type="text" class="form-control" name="nome" width="200px" required >
</div>

<div class="col-md-8">
<label for="email">Email</label>
<input type="email" name="email" class="form-control" required>
</div>
<div class="form-row">
<div class="col-md-3 ml-3">
<label for="telefoneFixo">Telefone Fixo</label>
<input type="text" name="telefoneFixo" class="form-control" required>
</div>
<div class="col-md-3 ml-3">
<label for="telefoneCelular">Telefone Celular</label>
<input type="text" name="telefoneCelular" class="form-control" required>
</div>
</div>
<div class="form-row">
<div class="col-md-3 ml-3">
<label for="cep"> Cep</label>
<input type="text" name="cep" class="form-control"required>
</div>
<div class="col-md-2 ml-3">
<label for="estado">Estado</label>
<input type="text" name="estado" class="form-control" required>
</div>
<div class="col-md-2 ml-3">
<label for="cidade"> Cidade</label>
<input type="text" name="cidade" class="form-control" required>
</div>
</div>
<div class="col-md-8 ">
<label for="municipio">Municipio</label>
<input type="text" name="municipio" class="form-control"required>
</div>
<div class="col-md-8">
<label for="sexo">Sexo</label><br>
<input type="radio" name="sexo" value="masculino">Masculino
<input type="radio" name="sexo" value="feminino">Feminino
</div>
<div class="col-md-8">
<label for="dataDeNascimento">Data de Nascimento</label>
<input type="date" name="dataDeNascimento" class="form-control" required>
</div>
<div class="col-md-8">
<label for="cpf"> CPF</label>
<input type="text" name="cpf"  class="form-control" maxlength="11" required>
</div>
<div class="ml-3">
<input class="btn btn-primary mt-2" type="button" value="Enviar" onclick="VerificaCPFp1();">
</div>
  </form>
  </div>
  <?php 
    $dados_recebidos=false;
    if(isset($_POST['nome'])){
      $nome=$_POST['nome'];
      $dados_recebidos=true;
      }
      if(isset($_POST['email'])){
        $email=$_POST['email'];
      
      }
      if(isset($_POST['telefoneFixo'])){
        $telefoneFixo=$_POST['telefoneFixo'];
      
      }
      if(isset($_POST['telefoneCelular'])){
        $telefoneCelular=$_POST['telefoneCelular'];
      
      }
      if(isset($_POST['cep'])){
        $cep=$_POST['cep'];
      
      }
      if(isset($_POST['cidade'])){
        $cidade=$_POST['cidade'];
      
      }
      if(isset($_POST['municipio'])){
        $municipio=$_POST['municipio'];
      
      }
      if(isset($_POST['estado'])){
        $estado=$_POST['estado'];
      
      }
      if(isset($_POST['sexo'])){
        $sexo=$_POST['sexo'];
      
      }
      if(isset($_POST['dataDeNascimento'])){
        $dataDeNascimento = $_POST['dataDeNascimento'];
        date('d-m-Y', strtotime($dataDeNascimento));
        
        $dataDeNascimento = date("Y-m-d",strtotime(str_replace('/','-',$dataDeNascimento)));  
        date('Y-m-d', strtotime($dataDeNascimento));
      
      }
      if(isset($_POST['cpf'])){
        $cpf=$_POST['cpf'];
      
      }
    
    require('conexao.php');
    
    if (!$conn) {
      die("Connection failed: " . mysqli_connect_error());
    }
    if($dados_recebidos){
    $sql = "INSERT INTO Formulario(nome,email,telefoneFixo,telefoneCelular,
    cep,estado,cidade,municipio,sexo,dataDeNascimento,cpf)
    VALUES ('$nome','$email',$telefoneFixo,$telefoneCelular,$cep,'$estado','$cidade',
    '$municipio','$sexo','$dataDeNascimento',$cpf)";
    
    if (mysqli_query($conn, $sql)){
      echo  "<script>alert('cadastro efetuado com sucesso');</script>";
    }
  }
  ?>

<script src="validaCPF.js"></script>   

  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

  </body>
  
</html>
