package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IotSiteWiseMultiLayerStorageProperty {

  def apply(
    customerManagedS3Storage: Option[software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty.Builder)
      .customerManagedS3Storage(customerManagedS3Storage.orNull)
      .build()
}
