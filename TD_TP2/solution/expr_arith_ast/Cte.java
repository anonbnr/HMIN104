class Cte extends ExprArith{
  int val;

  Cte(int val){this.val = val;}

  int eval(){return this.val;}
}
