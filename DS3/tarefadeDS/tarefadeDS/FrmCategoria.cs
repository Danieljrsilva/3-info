using System;
using System.Windows.Forms;

namespace tarefadeDS
{
    public partial class FrmCategoria : Form
    {
        public FrmCategoria()
        {
            InitializeComponent();
        }

        private void FrmCategoria_FormClosed(object sender, FormClosedEventArgs e)
        {
            MeusFormularios.FormCategoria = null;
        }

        private void FrmCategoria_Load(object sender, EventArgs e)
        {
            //coloca na propriedade DataSource a tblCategorias (Primeiro chama a classe e depois o obj de conexão)
            
        }
    }
}
