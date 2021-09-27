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
    public partial class frmProdutosPorCategoria : Form
    {
        public frmProdutosPorCategoria()
        {
            InitializeComponent();
        }

        private void frmProdutosPorCategoria_FormClosed(object sender, FormClosedEventArgs e)
        {
            MeusFormaularios.formProdutoPorCategoria = null;
        }
        private void Pesquisar(int recebeCodigoDaCategoria)
        {
            this.tblProdutoBindingSource.DataSource = ClasseDeConexao.CriandoConexao.tblProdutos.Where(codSelecionado => codSelecionado.FKCodigoCategoria == recebeCodigoDaCategoria);
        }

        private void frmProdutosPorCategoria_Load(object sender, EventArgs e)
        {
            this.tblCategoriaBindingSource.DataSource = ClasseDeConexao.CriandoConexao.tblCategorias;
            
        }

        private void btnConsultar_Click(object sender, EventArgs e)
        {
            this.Pesquisar((int)cmbConsultaCategoria.SelectedValue);    
        }

        private void tblProdutoDataGridView_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }
    }
}
