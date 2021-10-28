package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatastoreStorageProperty {

  def apply(
    customerManagedS3: Option[software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3Property] = None,
    iotSiteWiseMultiLayerStorage: Option[software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty] = None,
    serviceManagedS3: Option[software.amazon.awscdk.services.iotanalytics.CfnDatastore.ServiceManagedS3Property] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastoreStorageProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastoreStorageProperty.Builder)
      .customerManagedS3(customerManagedS3.orNull)
      .iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage.orNull)
      .serviceManagedS3(serviceManagedS3.orNull)
      .build()
}
