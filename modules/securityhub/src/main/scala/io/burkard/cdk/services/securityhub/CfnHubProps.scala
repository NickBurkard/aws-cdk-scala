package io.burkard.cdk.services.securityhub

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHubProps {

  def apply(
    tags: Option[AnyRef] = None
  ): software.amazon.awscdk.services.securityhub.CfnHubProps =
    (new software.amazon.awscdk.services.securityhub.CfnHubProps.Builder)
      .tags(tags.orNull)
      .build()
}
