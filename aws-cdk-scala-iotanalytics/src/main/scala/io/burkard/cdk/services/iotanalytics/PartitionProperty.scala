package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PartitionProperty {

  def apply(
    attributeName: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty.Builder)
      .attributeName(attributeName.orNull)
      .build()
}
