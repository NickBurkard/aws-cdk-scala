package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WebhookFilterProperty {

  def apply(
    pattern: Option[String] = None,
    excludeMatchedPattern: Option[Boolean] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty.Builder)
      .pattern(pattern.orNull)
      .excludeMatchedPattern(excludeMatchedPattern.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .`type`(`type`.orNull)
      .build()
}
