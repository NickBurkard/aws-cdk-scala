package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TimestampColumnProperty {

  def apply(
    columnName: Option[String] = None,
    columnFormat: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty.Builder)
      .columnName(columnName.orNull)
      .columnFormat(columnFormat.orNull)
      .build()
}
