package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VariantPropertyProperty {

  def apply(
    variantPropertyType: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpoint.VariantPropertyProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpoint.VariantPropertyProperty.Builder)
      .variantPropertyType(variantPropertyType.orNull)
      .build()
}
