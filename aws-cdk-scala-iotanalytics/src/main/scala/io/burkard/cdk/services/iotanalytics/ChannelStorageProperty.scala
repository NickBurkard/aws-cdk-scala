package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ChannelStorageProperty {

  def apply(
    customerManagedS3: Option[software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property] = None,
    serviceManagedS3: Option[software.amazon.awscdk.services.iotanalytics.CfnChannel.ServiceManagedS3Property] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty.Builder)
      .customerManagedS3(customerManagedS3.orNull)
      .serviceManagedS3(serviceManagedS3.orNull)
      .build()
}
