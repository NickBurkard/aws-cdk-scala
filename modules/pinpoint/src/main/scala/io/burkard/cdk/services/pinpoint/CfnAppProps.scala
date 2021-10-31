package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAppProps {

  def apply(
    name: Option[String] = None,
    tags: Option[AnyRef] = None
  ): software.amazon.awscdk.services.pinpoint.CfnAppProps =
    (new software.amazon.awscdk.services.pinpoint.CfnAppProps.Builder)
      .name(name.orNull)
      .tags(tags.orNull)
      .build()
}
