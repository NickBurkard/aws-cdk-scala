package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionTypeIdProperty {

  def apply(
    provider: Option[String] = None,
    version: Option[String] = None,
    category: Option[String] = None,
    owner: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.Builder)
      .provider(provider.orNull)
      .version(version.orNull)
      .category(category.orNull)
      .owner(owner.orNull)
      .build()
}
