package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WebhookFilterProperty {

  def apply(
    pattern: String,
    `type`: String,
    excludeMatchedPattern: Option[Boolean] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty.Builder)
      .pattern(pattern)
      .`type`(`type`)
      .excludeMatchedPattern(excludeMatchedPattern.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
