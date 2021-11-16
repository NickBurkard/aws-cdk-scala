package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionTypeIdProperty {

  def apply(
    provider: String,
    version: String,
    category: String,
    owner: String
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.Builder)
      .provider(provider)
      .version(version)
      .category(category)
      .owner(owner)
      .build()
}
