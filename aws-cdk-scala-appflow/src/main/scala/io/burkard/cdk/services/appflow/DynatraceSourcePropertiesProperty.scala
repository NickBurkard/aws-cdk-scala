package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DynatraceSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
