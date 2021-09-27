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
    public partial class frmCategoria : Form
    {
        public frmCategoria()
        {
            InitializeComponent();
        }

        //função que verifica o valor corrente no BD
        public tblCategoria CategoriaAtual
        {
            get
            {
                //verifica no BD o valor "corrente" selecionado
                return (tblCategoria)this.tblCategoriaBindingSource.Current;
            }
        }

        //função para verificar se tem categoria cadastrada em produtos
        private bool CategoriaPossuiProduto(tblCategoria categoria)
        {
            var produtos = ClasseDeConexao.CriandoConexao.tblProdutos.Where
                (existe => existe.FKCodigoCategoria == categoria.codigoCategoria);

            if (produtos.Count() > 0)
                return true;
            else
                return false;
        }

        //função que criaremos para validar o text categoria 
        private bool valida()
        {
            //Trim retira os espaços nas palavras
            if (txtProcuraCategoria.Text.Trim() == string.Empty)
            {
                MessageBox.Show("É precizo preencher o campo categoria");
                txtProcuraCategoria.Focus();
                return false;
            }
            return true;
        }

        private void frmCategoria_FormClosed(object sender, FormClosedEventArgs e)
        {
            MeusFormaularios.formCategoria = null;
        }

        private void frmCategoria_Load(object sender, EventArgs e)
        {
            //abre a conexão e popula o dataSource com os dados da tblCategoria
            this.tblCategoriaBindingSource.DataSource = ClasseDeConexao.CriandoConexao.tblCategorias;
        }

        private void btnNovo_Click(object sender, EventArgs e)
        {
            //abrir o campo para gravar
            this.tblCategoriaBindingSource.AddNew();

            //habilitando btns
            btnCancelar.Enabled = true;
            btnExcluir.Enabled = true;
            btnGravar.Enabled = true;
        }

        private void btnGravar_Click(object sender, EventArgs e)
        {
            //se o txtCategoria estiver com o valor....
            if(this.valida())
            {
                //[...]finaliza a edição
                this.tblCategoriaBindingSource.EndEdit();
                //realizando as modificações

                //SubmitChanges -> Faz o mesmo sem modificar o DataContext. 
                //O código terá quer fazer qualquer ajuste nele manualmente.
                //A transação não contempla o que está na memória. 
                //Dá flexibilidade de como proceder com esses dados, se devem ser descartados,
                //modificados, ou só tentar de novo.
                ClasseDeConexao.CriandoConexao.SubmitChanges();
                MessageBox.Show("Categoria armazenada com sucesso");
            }
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            this.tblCategoriaBindingSource.CancelEdit();
            //desabilitando btns
            btnCancelar.Enabled = false;
            btnExcluir.Enabled = false;
            btnGravar.Enabled = false;
        }

        private void btnExcluir_Click(object sender, EventArgs e)
        {
            if(MessageBox.Show("Tem certeza que deseja excluir" + txtProcuraCategoria.Text+
            "? ", "CONFIRMAÇÃO!!!", MessageBoxButtons.YesNo,
            MessageBoxIcon.Question) == DialogResult.Yes)
            {
                if(this.CategoriaPossuiProduto(this.CategoriaAtual))
                {
                    MessageBox.Show("Não é possivel excluir a categoria");
                }
                else
                {
                    this.tblCategoriaBindingSource.RemoveCurrent();
                    ClasseDeConexao.CriandoConexao.SubmitChanges();
                    MessageBox.Show("Categoria Excluído com sucesso");
                }
            }
        }
    }
}
