package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InforNexusSourcePropertiesProperty {

  def apply(
    `object`: String
  ): software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty.Builder)
      .`object`(`object`)
      .build()
}
