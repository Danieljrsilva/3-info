using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace info.DAL
{
    public class ClasseDeConexao
    {
        //Criando  a propriedade dataContext que carrega toda a conexao com o BD
        public static MeuBdNoCSharpDataContext abrindoConexao;
         
        public static MeuBdNoCSharpDataContext CriandoConexao
        {
            //usando método get para criar a conexão
            get
            {
                //se for nulo
                if(abrindoConexao == null)
                {
                    //cria conexão
                    abrindoConexao = new MeuBdNoCSharpDataContext();
                }
                //senão retorna a conexão ja existente
                return abrindoConexao;
            }
        }
    }
}
