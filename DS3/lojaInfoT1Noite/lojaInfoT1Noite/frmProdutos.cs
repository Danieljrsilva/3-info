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
    public partial class frmProdutos : Form
    {
        public frmProdutos()
        {
            InitializeComponent();
        }

        private void frmProdutos_Load(object sender, EventArgs e)
        {
            this.tblProdutoBindingSource.DataSource = ClasseDeConexao.CriandoConexao.tblProdutos;
            this.tblProdutoBindingSource.DataSource = ClasseDeConexao.CriandoConexao.tblCategorias;
        }

        private void frmProdutos_FormClosed(object sender, FormClosedEventArgs e)
        {
            MeusFormaularios.formProduto = null;
        }

        private void btnNovo_Click(object sender, EventArgs e)
        {
            this.tblProdutoBindingSource.AddNew();
            btnGravar.Enabled = true;
            btnCancelar.Enabled = true;
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            this.tblProdutoBindingSource.CancelEdit();
            btnGravar.Enabled = false;
            btnCancelar.Enabled = false;

        }

        private void btnGravar_Click(object sender, EventArgs e)
        {
            this.tblProdutoBindingSource.EndEdit();
            ClasseDeConexao.CriandoConexao.SubmitChanges();
            //atualiza datagrid
            dgvProduto.Refresh();
            MessageBox.Show("Produto armazenado com sucesso");
            btnGravar.Enabled = false;
            btnCancelar.Enabled = false;
        }

        private void btnExcluir_Click(object sender, EventArgs e)
        {
            this.tblProdutoBindingSource.RemoveCurrent();
            btnGravar.Enabled = false;
            btnCancelar.Enabled = false;

        }

        private void dgvProduto_CellFormatting(object sender, DataGridViewCellFormattingEventArgs e)
        {
            if(e.Value != null && e.ColumnIndex == 4)
            {
                e.Value = ((tblCategoria)e.Value).NomeCategoria;
            }
        }
    }
}
