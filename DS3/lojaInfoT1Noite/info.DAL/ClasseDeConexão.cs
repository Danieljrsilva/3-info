using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace info.DAL
{
    //deixando a classe pública para ser acessível por qq form
    class ClasseDeConexão
    {
        //criando propriedade dataContext que carrega toda a conexão do BD
        public static MeuBDNoCSharpDataContext abrindoConexão;

        //conectando e verificando a conexão
        public static MeuBDNoCSharpDataContext CriandoConexão
        {
            get
            {
                if(abrindoConexão==null)
                {
                    //se for nulo abrir a conexão
                    abrindoConexão = new MeuBDNoCSharpDataContext();
                }
                //caso a conexão estiver aberta
                return abrindoConexão;
            }
        }
    }
}
