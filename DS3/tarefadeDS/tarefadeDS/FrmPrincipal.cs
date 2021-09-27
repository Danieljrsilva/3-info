using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace tarefadeDS
{
    public partial class FrmPrincipal : Form
    {
        public FrmPrincipal()
        {
            InitializeComponent();
        }

        private void categoriaToolStripMenuItem_Click(object sender, EventArgs e)
        {
            //se o form for nulo
            if (MeusFormularios.FormCategoria == null)
                //criando o form
                MeusFormularios.FormCategoria = new FrmCategoria();

            //abro o form criado acima
            MeusFormularios.FormCategoria.Show();
            //aplico o focu nele
            MeusFormularios.FormCategoria.Focus();
        }

        private void produtosToolStripMenuItem_Click(object sender, EventArgs e)
        {
            //se o form for nulo
            if (MeusFormularios.FormProduto == null)
                //criando o form
                MeusFormularios.FormProduto = new FrmProduto();

            //abro o form criado acima
            MeusFormularios.FormProduto.Show();
            //aplico o focu nele
            MeusFormularios.FormProduto.Focus();
        }
    }
}
