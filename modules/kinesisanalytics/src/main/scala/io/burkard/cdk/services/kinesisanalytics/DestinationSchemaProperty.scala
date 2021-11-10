package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DestinationSchemaProperty {

  def apply(
    recordFormatType: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty.Builder)
      .recordFormatType(recordFormatType.orNull)
      .build()
}
