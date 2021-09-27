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
    public partial class frmVendas : Form
    {
        public frmVendas()
        {
            InitializeComponent();
        }

        private void frmVendas_FormClosed(object sender, FormClosedEventArgs e)
        {
            MeusFormaularios.formVendas = null;
        }

        private void frmVendas_Load(object sender, EventArgs e)
        {
            this.tblpessoaBindingSource.DataSource = ClasseDeConexao.CriandoConexao.tblpessoas;
        }
    }
}
