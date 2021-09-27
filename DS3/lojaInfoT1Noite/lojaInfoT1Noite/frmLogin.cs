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
    public partial class frmLogin : Form
    {
        //variável global
        public bool logado = false;

        public frmLogin()
        {
            InitializeComponent();
        }

        //metodo para LOGAR
        private void efetuarLogin()
        {
            var usuario = ClasseDeConexao.CriandoConexao.tblUsuarios.Count(
                todosUsers => todosUsers.NomeUsuario == txtUsuario.Text 
                && todosUsers.SenhaUsuario == txtSenha.Text);

            //verificando o valor retornado
            if(usuario > 0)
            {
                //seta o logado
                this.logado = true;

                //fecha a tela de Login
                this.Dispose();
            }
            else
            {
                MessageBox.Show("Usuario ou senha inválido", "Erro ao Logar");
            }
        }

        private void frmLogin_Load(object sender, EventArgs e)
        {

        }

        private void btnLogar_Click(object sender, EventArgs e)
        {
            efetuarLogin();
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            this.Dispose();
        }

        private void txtUsuario_TextChanged(object sender, EventArgs e)
        {

        }

        private void txtUsuario_KeyPress(object sender, KeyPressEventArgs e)
        {
            if(e.KeyChar == (char)13)
            {
                txtSenha.Focus();
            }
        }
    }
}
