using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace sınıf
{
    public partial class kronometre : Form
    {
        public kronometre()
        {
            InitializeComponent();
        }
       public  int  sayac ;
        private void kronometre_Load(object sender, EventArgs e)
        {
            label1.Text = "0";
            timer1.Interval = 100;
            
        }

        private void btnbaşla_Click(object sender, EventArgs e)
        {
            timer1.Start();
           

        }

        private void btndurdr_Click(object sender, EventArgs e)
        {
            timer1.Stop();
        }

        private void btnsıfırla_Click(object sender, EventArgs e)
        {
         sayac = 0;
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            sayac++;
            label1.Text=sayac.ToString();
           

        }
    }
}
