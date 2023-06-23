/*
{
   "packageTypes":[
      {
         "packageCode":"KOLİ",
         "subPackageCode":"PAKET"
      },
      {
         "packageCode":"ADET",
         "subPackageCode":"-"
      },
      {
         "packageCode":"PAKET",
         "subPackageCode":"ADET"
      }
   ]
}
*/

    public void loop(List<PackageType> packageTypes, String searchPackageCode){
        for(int i = 0; i < packageTypes.size(); i++){
            PackageType packageType = packageTypes.get(i);
            if (packageType.getSubPackageCode().equals(searchPackageCode)){

                // Save
                }

                loop(packageTypes, packageType.getPackageCode());
            }
        }
    }
