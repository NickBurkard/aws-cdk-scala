package io.burkard.cdk.services.nimblestudio

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActiveDirectoryComputerAttributeProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty =
    (new software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryComputerAttributeProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
