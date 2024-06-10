namespace MultiMaster.Platforms.Android.Resources;

public class NewPage1 : ContentPage
{
	public NewPage1()
	{
		Content = new VerticalStackLayout
		{
			Children = {
                new Label { HorizontalOptions = LayoutOptions.Center, VerticalOptions = LayoutOptions.Center, Text = "Welcome to .NET MAUI!" },
                new Button { Text = "Button 1", HorizontalOptions = LayoutOptions.Center, VerticalOptions = LayoutOptions.Center },
                new Button { Text = "Button 2", HorizontalOptions = LayoutOptions.Center, VerticalOptions = LayoutOptions.Center },
                new Button { Text = "Button 3", HorizontalOptions = LayoutOptions.Center, VerticalOptions = LayoutOptions.Center }
            }
		};
	}
}