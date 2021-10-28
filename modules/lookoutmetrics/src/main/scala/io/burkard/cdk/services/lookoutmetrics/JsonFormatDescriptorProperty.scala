package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JsonFormatDescriptorProperty {

  def apply(
    fileCompression: Option[String] = None,
    charset: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.JsonFormatDescriptorProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.JsonFormatDescriptorProperty.Builder)
      .fileCompression(fileCompression.orNull)
      .charset(charset.orNull)
      .build()
}
