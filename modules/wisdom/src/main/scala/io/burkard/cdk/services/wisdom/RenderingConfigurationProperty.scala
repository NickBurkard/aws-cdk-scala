package io.burkard.cdk.services.wisdom

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RenderingConfigurationProperty {

  def apply(
    templateUri: Option[String] = None
  ): software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty =
    (new software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.RenderingConfigurationProperty.Builder)
      .templateUri(templateUri.orNull)
      .build()
}
