using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace tarefadeDS
{
    public partial class btnLojaInfo : Form
    {
        public btnLojaInfo()
        {
            InitializeComponent();
        }

        private void btnLojaInfo_Load(object sender, EventArgs e)
        {

        }

        private void btnLojaInfo_FormClosed(object sender, FormClosedEventArgs e)
        {
            MeusFormularios.Fomrcategoria = null;
        }
    }
}
