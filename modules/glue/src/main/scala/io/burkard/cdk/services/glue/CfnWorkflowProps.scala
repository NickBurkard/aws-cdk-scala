package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWorkflowProps {

  def apply(
    name: Option[String] = None,
    defaultRunProperties: Option[AnyRef] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None
  ): software.amazon.awscdk.services.glue.CfnWorkflowProps =
    (new software.amazon.awscdk.services.glue.CfnWorkflowProps.Builder)
      .name(name.orNull)
      .defaultRunProperties(defaultRunProperties.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .build()
}
