package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TimestampPartitionProperty {

  def apply(
    attributeName: Option[String] = None,
    timestampFormat: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty.Builder)
      .attributeName(attributeName.orNull)
      .timestampFormat(timestampFormat.orNull)
      .build()
}
