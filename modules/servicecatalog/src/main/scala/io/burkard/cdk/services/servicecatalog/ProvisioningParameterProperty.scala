package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProvisioningParameterProperty {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty =
    (new software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
