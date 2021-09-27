using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace info.DAL
{
    //deixando a classe pública para ser acessível por qq form
    public class ClasseDeConexao
    {
        //criando propriedade dataContext que carrega toda a conexão do BD
        public static MeuBDNoCSharpDataContext abrindoConexao;

        //conectando e verificando a conexão
        public static MeuBDNoCSharpDataContext CriandoConexao
        {
            get
            {
                if(abrindoConexao==null)
                {
                    //se for nulo abrir a conexão
                    abrindoConexao = new MeuBDNoCSharpDataContext();
                }
                //caso a conexão estiver aberta
                return abrindoConexao;
            }
        }
    }
}
