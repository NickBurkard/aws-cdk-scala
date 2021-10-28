package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InforNexusSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
