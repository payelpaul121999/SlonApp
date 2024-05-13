package com.pal.slonapp.ui.theme.data

import com.pal.slonapp.ui.theme.model.MenuModel
import com.pal.slonapp.ui.theme.model.PersonModel
import com.pal.slonapp.ui.theme.model.ServiceBannerModel
import com.pal.slonapp.ui.theme.model.ServiceModel

fun getMenuModels(): List<MenuModel> {
    val menuModels = listOf(
        MenuModel("https://cdn-icons-png.freepik.com/256/1077/1077035.png", "Hair cut"),
        MenuModel("https://cdn-icons-png.freepik.com/256/3178/3178167.png", "Growth"),
        MenuModel("https://cdn-icons-png.freepik.com/256/263/263115.png", "Treatment"),
        MenuModel("https://cdn-icons-png.freepik.com/256/2823/2823511.png", "Shaving"),
        MenuModel("https://cdn-icons-png.freepik.com/256/4163/4163679.png", "Trim & style"),
        MenuModel("https://cdn-icons-png.freepik.com/256/9751/9751000.png", "Cut & style"),
        MenuModel("https://cdn-icons-png.freepik.com/256/910/910077.png", "Monthly color"),
        MenuModel("https://cdn-icons-png.freepik.com/256/2318/2318786.png", "Hair botox"),
        MenuModel("https://cdn-icons-png.freepik.com/256/6422/6422200.png", "Blow-dry"),
        MenuModel("https://cdn-icons-png.freepik.com/256/785/785202.png","Straight"),
        MenuModel("https://cdn-icons-png.freepik.com/256/2823/2823511.png", "Smooth"),
        MenuModel("https://cdn-icons-png.freepik.com/256/4163/4163679.png", "Out curl")


    )
    return menuModels
}

fun getServiceModelStaticData():List<ServiceModel>{
    val serviceModel = listOf(
        ServiceModel("The Color patten","South kolkata","4.5","https://img.freepik.com/premium-photo/elevate-your-style-with-dazzling-hair-color-palette-explore-ultimate-hair-dye-color-chart_1000124-52068.jpg"),
        ServiceModel("Colorful nails art","South kolkata","3.6","https://img.freepik.com/premium-photo/close-up-colorful-artificial-nails-with-feather_1048944-25224788.jpg?w=826"),
        ServiceModel("Hair color","Howrah ","4.3","https://img.freepik.com/premium-photo/elevate-your-style-with-dazzling-hair-color-palette-explore-ultimate-hair-dye-color-chart_1000124-52068.jpg"),
        ServiceModel("Hair cut","Howrah ","4.3","https://img.freepik.com/free-photo/professional-girl-hairdresser-makes-client-haircut-girl-is-sitting-mask-beauty-salon_343596-4456.jpg"),
        ServiceModel("Hair treatment with expert","Howrah ","4.3","https://img.freepik.com/free-photo/woman-getting-her-hair-done-japanese-hairdressers_23-2149395781.jpg"),
        ServiceModel("The Color patten","South kolkata","4.5","https://img.freepik.com/premium-photo/elevate-your-style-with-dazzling-hair-color-palette-explore-ultimate-hair-dye-color-chart_1000124-52068.jpg"),
        ServiceModel("Colorful nails art","South kolkata","3.6","https://img.freepik.com/premium-photo/close-up-colorful-artificial-nails-with-feather_1048944-25224788.jpg?w=826"),
        ServiceModel("Hair color","Howrah ","4.3","https://img.freepik.com/premium-photo/elevate-your-style-with-dazzling-hair-color-palette-explore-ultimate-hair-dye-color-chart_1000124-52068.jpg"),
        ServiceModel("Hair cut","Howrah ","4.3","https://img.freepik.com/free-photo/professional-girl-hairdresser-makes-client-haircut-girl-is-sitting-mask-beauty-salon_343596-4456.jpg"),
    )
    return serviceModel
}

fun getSpecialistData():List<PersonModel>{
    val personModel = listOf(
        PersonModel("Mr. Aman","https://img.freepik.com/premium-photo/ambition-gets-you-far-i-can-testify-that-portrait-confident-mature-businessman-standing-office-with-his-colleagues-background_590464-47752.jpg"),
        PersonModel("Miss. Asha","https://img.freepik.com/premium-photo/woman-white-shirt-stands-with-her-arms-crossed_853645-18719.jpg"),
        PersonModel("Mr. Sid","https://img.freepik.com/free-photo/happy-businessman-smiling-camera_1163-4660.jpg?size=626&ext=jpg"),
        PersonModel("Miss. Eis","https://img.freepik.com/premium-psd/admiring-adult-woman-with-long-hair-from-south-asian-ethnicity-dressed-paramedic-attire-poses-hand-brushing-through-hair-style-against-pastel-mint-background_410516-143967.jpg"),
        PersonModel("Mr. Tiwon","https://img.freepik.com/premium-photo/young-female-customer-getting-blush-powder-her-cheek-with-brush_362389-6379.jpg"),
        PersonModel("Miss. Asha","https://img.freepik.com/premium-photo/woman-white-shirt-stands-with-her-arms-crossed_853645-18719.jpg"),
        PersonModel("Mr. Sid","https://img.freepik.com/free-photo/happy-businessman-smiling-camera_1163-4660.jpg?size=626&ext=jpg"),
        PersonModel("Miss. Eis","https://img.freepik.com/premium-psd/admiring-adult-woman-with-long-hair-from-south-asian-ethnicity-dressed-paramedic-attire-poses-hand-brushing-through-hair-style-against-pastel-mint-background_410516-143967.jpg")
    )
    return personModel
}

fun getSeviceBannerStaticData():List<ServiceBannerModel>{
 val serviceList =listOf(
     ServiceBannerModel("Root touch up","4.7 (65.1 k reviews)","₹249 * 90 mins","https://img.freepik.com/free-photo/woman-getting-treatment-hairdresser-shop_23-2149230922.jpg","Expert application to blend the colour of roots.") ,
     ServiceBannerModel("Henna/ mehendi(only applicaion)","4.80 (40.5k reviews)","₹249 * 30 mins","https://img.freepik.com/free-photo/woman-getting-treatment-hairdresser-shop_23-2149230922.jpg","Expert application to blend the colour of roots.") ,
     ServiceBannerModel("Root touch up","4.7 (65.1 k reviews)","₹249 * 90 mins","https://img.freepik.com/free-photo/woman-getting-treatment-hairdresser-shop_23-2149230922.jpg","Expert application to blend the colour of roots.") ,
     ServiceBannerModel("Henna/ mehendi(only applicaion)","4.80 (40.5k reviews)","₹249 * 30 mins","https://img.freepik.com/free-photo/woman-getting-treatment-hairdresser-shop_23-2149230922.jpg","Expert application to blend the colour of roots."),
     ServiceBannerModel("Root touch up","4.7 (65.1 k reviews)","₹249 * 90 mins","https://img.freepik.com/free-photo/woman-getting-treatment-hairdresser-shop_23-2149230922.jpg","Expert application to blend the colour of roots.") ,
     ServiceBannerModel("Henna/ mehendi(only applicaion)","4.80 (40.5k reviews)","₹249 * 30 mins","https://img.freepik.com/free-photo/woman-getting-treatment-hairdresser-shop_23-2149230922.jpg","Expert application to blend the colour of roots.") ,
     ServiceBannerModel("Root touch up","4.7 (65.1 k reviews)","₹249 * 90 mins","https://img.freepik.com/free-photo/woman-getting-treatment-hairdresser-shop_23-2149230922.jpg","Expert application to blend the colour of roots.") ,
     ServiceBannerModel("Henna/ mehendi(only applicaion)","4.80 (40.5k reviews)","₹249 * 30 mins","https://img.freepik.com/free-photo/woman-getting-treatment-hairdresser-shop_23-2149230922.jpg","Expert application to blend the colour of roots.")
 )
    return serviceList
}