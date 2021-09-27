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
    public partial class frmRelatoriosDeProdutos : Form
    {
        public frmRelatoriosDeProdutos()
        {
            InitializeComponent();
        }

        private void frmRelatoriosDeProdutos_FormClosed(object sender, FormClosedEventArgs e)
        {
            MeusFormaularios.formRelProdutos = null;
        }

        private void frmRelatoriosDeProdutos_Load(object sender, EventArgs e)
        {
            this.tblProdutoBindingSource.DataSource = ClasseDeConexao.CriandoConexao.tblProdutos;
            this.reportViewer1.RefreshReport();
        }

        private void reportViewer1_Load(object sender, EventArgs e)
        {

        }

        public static implicit operator frmRelatoriosDeProdutos(frmListaDeCategoria v)
        {
            throw new NotImplementedException();
        }
    }
}
