package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProvisioningArtifactPropertiesProperty {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    disableTemplateValidation: Option[Boolean] = None,
    info: Option[AnyRef] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty =
    (new software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .disableTemplateValidation(disableTemplateValidation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .info(info.orNull)
      .build()
}
