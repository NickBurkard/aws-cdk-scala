package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IotSiteWiseMultiLayerStorageProperty {

  def apply(
    customerManagedS3Storage: software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty.Builder)
      .customerManagedS3Storage(customerManagedS3Storage)
      .build()
}
