package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RecordColumnProperty {

  def apply(
    name: Option[String] = None,
    mapping: Option[String] = None,
    sqlType: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty.Builder)
      .name(name.orNull)
      .mapping(mapping.orNull)
      .sqlType(sqlType.orNull)
      .build()
}
