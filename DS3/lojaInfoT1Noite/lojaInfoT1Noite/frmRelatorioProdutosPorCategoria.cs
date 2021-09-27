using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using CrystalDecisions.CrystalReports.Engine;
using CrystalDecisions.Shared;

namespace lojaInfoT1Noite
{
    public partial class frmRelatorioProdutosPorCategoria : Form
    {
        public int CodigoCategoria { get; set; }
        public frmRelatorioProdutosPorCategoria()
        {
            InitializeComponent();
        }

        private void frmRelatorioProdutosPorCategoria_FormClosed(object sender, FormClosedEventArgs e)
        {
            MeusFormaularios.formRelProdPorCat = null;
        }

        private void frmRelatorioProdutosPorCategoria_Load(object sender, EventArgs e)
        {
            ReportDocument rel = new ReportDocument();
            rel.Load(@"RPT\ProdutosPorcategoria.rpt");

            rel.SetParameterValue("codigoCategoria", this.CodigoCategoria);
            crvProdutoporCategoria.ReportSource = rel;
        }
    }
}
