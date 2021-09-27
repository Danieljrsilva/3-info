using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using infoT2.DAL;

namespace lojaInfoT2
{
    public partial class frmProdutos : Form
    {
        public frmProdutos()
        {
            InitializeComponent();
        }

        private void frmProduto_Load(object sender,EventArgs e)
        {
            this.tblProdutoBindingSource.DataSource = ClasseDeConexao.CriandoAConexao.tblProdutos;
            this.tblCategoriaBindingSource.DataSource = ClasseDeConexao.CriandoAConexao.tblCategorias;
        }
        private void frmProdutos_FormClosed(object sender, FormClosedEventArgs e)
        {
            MeusFormularios.FormProdutos = null;
        }

        private void frmProdutos_Load(object sender, EventArgs e)
        {

        }

        private void btnNovo_Click(object sender, EventArgs e)
        {
            this.tblProdutoBindingSource.AddNew();
            btnGravar.Enabled = true;
            btnCancelar.Enabled = true;
        }

        private void btnGravar_Click(object sender, EventArgs e)
        {
            this.tblProdutoBindingSource.EndEdit();
            ClasseDeConexao.CriandoAConexao.SubmitChanges();
            dgvProduto.Refresh();
            MessageBox.Show("Produto armazenado com sucesso");
            btnGravar.Enabled = false;
            btnCancelar.Enabled = false;
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            this.tblProdutoBindingSource.CancelEdit();
            btnGravar.Enabled = false;
            btnCancelar.Enabled = false;
        }

        private void btnExcluir_Click(object sender, EventArgs e)
        {
            this.tblCategoriaBindingSource.RemoveCurrent();
            ClasseDeConexao.CriandoAConexao.SubmitChanges();
            MessageBox.Show("Produto excluído com sucesso!");
        }

        private void dgvProduto_CellFormatting(object sender, DataGridViewCellFormattingEventArgs e)
        {
            if (e.Value != null && e.ColumnIndex == 4)
                e.Value = ((tblCategoria)e.Value).NomeCategoria;
        }
    }
}
 