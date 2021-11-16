package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PartitionProperty {

  def apply(
    attributeName: String
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty.Builder)
      .attributeName(attributeName)
      .build()
}
