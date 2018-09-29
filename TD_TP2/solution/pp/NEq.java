class NEq extends BinOp{
  NEq(ConstanteInt iog, ConstanteInt iod){
    this.operandeG = iog;
    this.operandeD = iod;
  }

  NEq(ConstanteBool bog, ConstanteBool bod){
    this.operandeG = bog;
    this.operandeD = bod;
  }
}
