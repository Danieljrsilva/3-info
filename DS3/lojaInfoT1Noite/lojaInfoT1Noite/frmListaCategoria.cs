using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using info.DAL;

namespace lojaInfoT1Noite
{
    public partial class frmListaCategoria : Form
    {
        public frmListaCategoria()
        {
            InitializeComponent();
        }

        private void frmListaCategoria_Load(object sender, EventArgs e)
        {
            MeusFormaularios.formListaCatehgoria = null;
        }

        private void btnLimpar_Click(object sender, EventArgs e)
        {
            if (MeusFormaularios.formRelProdPorCat == null)
            {
                MeusFormaularios.formRelProdPorCat = new frmRelatorioProdutosPorCategoria();
                MeusFormaularios.formRelProdPorCat.CodigoCategoria = (int)cmbListaPorCategoria.SelectedValue;

                MeusFormaularios.formRelProdPorCat.Show();
                MeusFormaularios.formRelProdPorCat.Focus();
            }
        }
    }
}
