package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DestinationSchemaProperty {

  def apply(
    recordFormatType: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty.Builder)
      .recordFormatType(recordFormatType.orNull)
      .build()
}
