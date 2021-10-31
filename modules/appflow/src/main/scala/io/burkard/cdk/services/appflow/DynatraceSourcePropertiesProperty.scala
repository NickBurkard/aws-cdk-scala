package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DynatraceSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
