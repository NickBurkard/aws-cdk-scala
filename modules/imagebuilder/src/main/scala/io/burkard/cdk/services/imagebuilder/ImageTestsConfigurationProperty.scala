package io.burkard.cdk.services.imagebuilder

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ImageTestsConfigurationProperty {

  def apply(
    imageTestsEnabled: Option[Boolean] = None,
    timeoutMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty.Builder)
      .imageTestsEnabled(imageTestsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .timeoutMinutes(timeoutMinutes.orNull)
      .build()
}