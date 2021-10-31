package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProvisioningParameterProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty =
    (new software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
