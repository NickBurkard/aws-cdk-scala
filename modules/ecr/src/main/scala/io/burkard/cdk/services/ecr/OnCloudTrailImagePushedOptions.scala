package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OnCloudTrailImagePushedOptions {

  def apply(
    ruleName: Option[String] = None,
    description: Option[String] = None,
    imageTag: Option[String] = None,
    eventPattern: Option[software.amazon.awscdk.services.events.EventPattern] = None,
    target: Option[software.amazon.awscdk.services.events.IRuleTarget] = None
  ): software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions =
    (new software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions.Builder)
      .ruleName(ruleName.orNull)
      .description(description.orNull)
      .imageTag(imageTag.orNull)
      .eventPattern(eventPattern.orNull)
      .target(target.orNull)
      .build()
}
