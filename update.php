<?php
require ('conexao.php');
$id=$_REQUEST['id'];
echo $id;
$nome=$_POST['nome'];
  $email=$_POST['email'];
  $telefoneFixo=$_POST['telefoneFixo'];
  $telefoneCelular=$_POST['telefoneCelular'];
  $cep=$_POST['cep'];
  $estado=$_POST['estado'];
  $cidade=$_POST['cidade'];
  $municipio=$_POST['municipio'];
  $sexo=$_POST['sexo'];
  $dataDeNascimento=$_POST['dataDeNascimento'];
  
  
$cpf=$_POST['cpf'];
$sql2="UPDATE formulario set nome='$nome',email='$email',telefoneFixo='$telefoneFixo',
telefoneCelular='$telefoneCelular',cep='$cep',estado='$estado',cidade='$cidade',municipio='$municipio'
,sexo='$sexo',dataDeNascimento='$dataDeNascimento' where id_numero_registro='$id'";

if(mysqli_query($conn,$sql2)){
  "<script>alert('sucesso')</script>";
};
?>