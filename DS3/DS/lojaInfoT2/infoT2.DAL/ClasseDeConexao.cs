using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace infoT2.DAL
{
    //colocando a nossa classe como publica para ser vista pelos forms
    public class ClasseDeConexao
    {
        //criando o objeto que abrira o acesso aos dados
        public static MeuBDNoCSharpDataContext abrindoConexão;


        public static MeuBDNoCSharpDataContext CriandoAConexao
        {
            get
            {
                if(abrindoConexão == null)
                {
                    abrindoConexão = new MeuBDNoCSharpDataContext();
                }
                //senao ele chama o abrindoConexao
                return abrindoConexão;
            }
        }
    }
}
