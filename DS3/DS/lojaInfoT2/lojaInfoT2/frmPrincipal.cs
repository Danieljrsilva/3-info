using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lojaInfoT2
{
    public partial class frmPrincipal : Form
    {
        public frmPrincipal()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void cadastrosToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void categoriasToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (MeusFormularios.FormCategoria == null)
            {
                MeusFormularios.FormCategoria = new frmCategoria();
                MeusFormularios.FormCategoria.Show();
                MeusFormularios.FormCategoria.Focus();
            }
        }

        private void produtosToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (MeusFormularios.FormProdutos == null)
            {
                MeusFormularios.FormProdutos = new frmProdutos();
                MeusFormularios.FormProdutos.Show();
                MeusFormularios.FormProdutos.Focus();
            }
        }
    }
}
