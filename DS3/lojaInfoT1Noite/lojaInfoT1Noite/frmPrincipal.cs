using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lojaInfoT1Noite
{
    public partial class frmPrincipal : Form
    {
        public frmPrincipal()
        {
            InitializeComponent();
        }

        private void categoriasToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if(MeusFormaularios.formProdutoPorCategoria == null)
            {
                //cria o form
                MeusFormaularios.formProdutoPorCategoria = new frmProdutosPorCategoria();

                //abro o form criado acima
                MeusFormaularios.formProdutoPorCategoria.Show();

                //aplico o focus
                MeusFormaularios.formProdutoPorCategoria.Focus();
            }
        }

        private void produtosToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (MeusFormaularios.formProduto == null)
            {
                //cria o form
                MeusFormaularios.formProduto = new frmProdutos();

                //abro o form criado acima
                MeusFormaularios.formProduto.ShowDialog();

                //aplico o focus
                //MeusFormaularios.formProduto.Focus();
            }
        }

        private void pessoaFísicaToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (MeusFormaularios.formPessoaFisica == null)
            {
                //cria o form
                MeusFormaularios.formPessoaFisica = new frmPessoaFisica();

                //abro o form criado acima
                MeusFormaularios.formPessoaFisica.Show();

                //aplico o focus
                MeusFormaularios.formPessoaFisica.Focus();
            }

        }

        private void realizarVendasToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (MeusFormaularios.formVendas == null)
            {
                //cria o form
                MeusFormaularios.formVendas = new frmVendas();

                //abro o form criado acima
                MeusFormaularios.formVendas.Show();

                //aplico o focus
                MeusFormaularios.formVendas.Focus();
            }

        }
    }
}
