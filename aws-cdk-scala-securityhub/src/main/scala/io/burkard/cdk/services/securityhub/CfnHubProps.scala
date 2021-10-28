package io.burkard.cdk.services.securityhub

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnHubProps {

  def apply(
    tags: Option[AnyRef] = None
  ): software.amazon.awscdk.services.securityhub.CfnHubProps =
    (new software.amazon.awscdk.services.securityhub.CfnHubProps.Builder)
      .tags(tags.orNull)
      .build()
}
