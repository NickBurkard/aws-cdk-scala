package io.burkard.cdk.services.imagebuilder

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ImageTestsConfigurationProperty {

  def apply(
    imageTestsEnabled: Option[Boolean] = None,
    timeoutMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty.Builder)
      .imageTestsEnabled(imageTestsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .timeoutMinutes(timeoutMinutes.orNull)
      .build()
}
