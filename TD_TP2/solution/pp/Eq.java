class Eq extends BinOp{
  Eq(ConstanteInt iog, ConstanteInt iod){
    this.operandeG = iog;
    this.operandeD = iod;
  }

  Eq(ConstanteBool bog, ConstanteBool bod){
    this.operandeG = bog;
    this.operandeD = bod;
  }
}
