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
    public partial class frmCategoria : Form
    {
        public frmCategoria()
        {
            InitializeComponent();
        }

        //criando uma função de verificação de retorno da categoria atual
        public tblCategoria CategoriaAtual

        {
            get
            {
                return (tblCategoria)this.tblCategoriaBindingSource.Current;
            }
        }
        // criando uma função de retorno de categorias cadastrada em produtos
        private bool categoriaPossuiProduto(tblCategoria categoria)
        {
            var produtos = ClasseDeConexao.CriandoAConexao.tblProdutos.Where(exista => exista.FKCodigoCategoria == categoria.CodigoCategoria);
            if (produtos.Count() > 0)
            {
                return true;
            }
            return false;
        }

        //criando uma função para ser chamada no btnGravar

        private bool Valida()
        {
            if (txtCategoria.Text.Trim() == string.Empty)
            {
                MessageBox.Show("O campo categoria é obrigatorio");
                txtCategoria.Focus();
                return false;
            }
            return true;
        }

        private void frmCategoria_FormClosed(object sender, FormClosedEventArgs e)
        {
            MeusFormularios.FormCategoria = null;
        }

        private void frmCategoria_Load(object sender, EventArgs e)
        {
            this.tblCategoriaBindingSource.DataSource = ClasseDeConexao.CriandoAConexao.tblCategorias;
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void btnNovo_Click(object sender, EventArgs e)
        {
            this.tblCategoriaBindingSource.AddNew();

            btnGravar.Enabled = true;
            btnExcluir.Enabled = true;
            btnCancelar.Enabled = true;
            btnNovo.Enabled = false;
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            this.tblCategoriaBindingSource.CancelEdit();
            btnGravar.Enabled = false;
            btnExcluir.Enabled = false;
            btnCancelar.Enabled = false;
            btnNovo.Enabled = true;
        }

        private void btnGravar_Click(object sender, EventArgs e)
        {
            //se valida for TRUE
            if (this.Valida())
            {
                //finaliza a edição
                this.tblCategoriaBindingSource.EndEdit();
                //cria a conexão e salva
                ClasseDeConexao.CriandoAConexao.SubmitChanges();
                MessageBox.Show("categoria salva com sucesso");
                btnGravar.Enabled = false;
                btnCancelar.Enabled = false;
                btnExcluir.Enabled = false;
                btnNovo.Enabled = true;
                txtCategoria.Clear();
                txtCategoria.Focus();
            }
        }

        private void btnExcluir_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("tem certeza que deseja excluir" + txtCategoria.Text + " ? ", "CONFIRMAÇÃO!!!", 
                MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                if (this.categoriaPossuiProduto(this.CategoriaAtual))
                {
                    MessageBox.Show("Não é possivel excluir" +
                        "categoria cadastrada em produtos");
                }
                else
                {
                    this.tblCategoriaBindingSource.RemoveCurrent();
                    ClasseDeConexao.CriandoAConexao.SubmitChanges();
                    MessageBox.Show("Produto Excluido com sucesso");

                }

            }
        }
    }
}
