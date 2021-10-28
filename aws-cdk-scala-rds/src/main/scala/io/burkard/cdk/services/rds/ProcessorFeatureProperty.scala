package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProcessorFeatureProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBInstance.ProcessorFeatureProperty =
    (new software.amazon.awscdk.services.rds.CfnDBInstance.ProcessorFeatureProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
