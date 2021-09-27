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
    public partial class frmPessoaFisica : Form
    {
        public frmPessoaFisica()
        {
            InitializeComponent();
        }

        //método para salvar em duas tabelas

        public tblpessoa CadastrarPessaoAtual
        {
            get
            {
                return (tblpessoa)this.tblpessoaBindingSource.Current;
            }
        }

        private void frmPessoaFisica_FormClosed(object sender, FormClosedEventArgs e)
        {
            MeusFormaularios.formPessoaFisica = null;
        }

       

        private void frmPessoaFisica_Load(object sender, EventArgs e)
        {
            this.tblpessoaBindingSource.DataSource = ClasseDeConexao.
            CriandoConexao.tblPessoaFisicas.Select(buscar => buscar.tblpessoa);
            //No comando acima,estamos acessando o tblPessoaFisicas e retornando a tblPessoa. Conseguimos isso por causa da chave primária.
        }

        private void dgvPessoafisica_CellFormatting(object sender, DataGridViewCellFormattingEventArgs e)
        {
            if(e.Value != null && e.ColumnIndex == 4)
            {
                e.Value = ((tblPessoaFisica)e.Value).CPF_PF;
            }
            if (e.Value != null && e.ColumnIndex == 5)
            {
                e.Value = ((tblPessoaFisica)e.Value).RG_PF;
            }
        }

        private void btnNovo_Click(object sender, EventArgs e)
        {
            btnCancelar.Enabled = true;
            btnGravar.Enabled = true;

            this.tblpessoaBindingSource.AddNew();

            //o código abaixo irá utilizar a última tupla salva
            //na tblPessoa para usar a FK para salvar no tblPessoaFísica
            this.CadastrarPessaoAtual.tblPessoaFisica = new tblPessoaFisica();
        }

        private void btnGravar_Click(object sender, EventArgs e)
        {
            this.tblpessoaBindingSource.EndEdit();
            ClasseDeConexao.CriandoConexao.SubmitChanges();
            dgvPessoafisica.Refresh();

            MessageBox.Show("Pessoa armazenada com sucesso");
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            this.tblpessoaBindingSource.CancelEdit();
        }

        private void btnExcluir_Click(object sender, EventArgs e)
        {
            if(MessageBox.Show("Tem certeza que deseja excluir?" , "Atenção!!!",
                MessageBoxButtons.YesNo, MessageBoxIcon.Question)== DialogResult.Yes)
            {
                this.tblpessoaBindingSource.RemoveCurrent();
                ClasseDeConexao.CriandoConexao.SubmitChanges();
                MessageBox.Show("Pessoa Excluída com sucesso!!!");
            }
        }
    }
}
