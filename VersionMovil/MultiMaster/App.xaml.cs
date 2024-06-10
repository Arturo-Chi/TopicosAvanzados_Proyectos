using MultiMaster.Views;

namespace MultiMaster
{
    public partial class App : Application
    {
        public App()
        {
            InitializeComponent();

            MainPage = new NavigationPage (new HomePage());
        }
    }
}
