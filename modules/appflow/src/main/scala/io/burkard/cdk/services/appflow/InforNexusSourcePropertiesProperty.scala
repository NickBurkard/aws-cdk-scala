package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InforNexusSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
