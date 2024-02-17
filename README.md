Fragments App featuring Fragments, TabLayout, and ViewPager.
This involves creating an Android application with multiple fragments that are displayed using a TabLayout and ViewPager combination.  
TabLayout for seamless navigation between different sections of the app. 
TabLayout provides a horizontal layout to display tabs, 
and ViewPager allows users to swipe between different fragments. 
This is a common UI pattern for organizing content in Android apps.
Different Fragments simply with a textView are created in no. of 3.
Then a ViewPager is used in activity_main.xml for which a custom adapter is 
used to layout the fragments in the viewpager, custoomer adapter made using FragmentStateAdapter which
used a Fragments list containing fragment objects and uses createFragment(int) method to
return fragment on to the view.

<img src="https://github.com/sanjuray/ViewPagerApp/assets/94555333/2c546139-447b-4ca9-ae6f-11103cb63b2c" width=400 height=650/>
<img src="https://github.com/sanjuray/ViewPagerApp/assets/94555333/f581cec9-5a5e-48c1-bcdf-47faa070737f" width=400 height=650/>
<img src="https://github.com/sanjuray/ViewPagerApp/assets/94555333/023d6e57-134f-4455-9fe3-bc0b242efc93" width=400 height=650/>
